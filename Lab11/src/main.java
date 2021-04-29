import java.util.*;

public class main {
	
	public static int SequenSearch(int target, int[] Array) {
		for(int i=0;i<Array.length;i++) {
			if(Array[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int target, int[] sortedArray) {
		int minIdx = 0;
		int maxIdx = sortedArray.length-1;
		while(minIdx<=maxIdx) {
			int midIdx = (minIdx+maxIdx)/2;
			if(sortedArray[midIdx]<target) {
				minIdx = midIdx;
			}else if(sortedArray[midIdx]>target) {
				maxIdx = midIdx;
			}else if(sortedArray[midIdx]==target) {
				return midIdx;
			}
		}
		return -1;
	}
	public static int binarySearchRecursive(int target, int[] sortedArray, int minIdx, int maxIdx) {
		if(minIdx > maxIdx||minIdx<0||maxIdx>sortedArray.length) {
			return -1;
		}else{
			while(minIdx<=maxIdx) {
				int midIdx = (minIdx+maxIdx)/2;
				if(sortedArray[midIdx]<target) {
					return binarySearchRecursive(target,sortedArray,midIdx,maxIdx);
				}else if(sortedArray[midIdx]>target) {
					return binarySearchRecursive(target,sortedArray,minIdx,midIdx);
				}else {
					return midIdx;
				}
			}
			return -1;
		}
	}
	public static void printArray(int[] array) {
		System.out.print("{");
		for(int i = 0 ; i<array.length-1;i++) {
			System.out.print(array[i]+",");
		}
		System.out.print(array[array.length-1]+"}");
	}
	
	
	public static void main(final String[] args) {
		int[] array = {2, 1, 9, 6, 4, 19, 15, 72, 53, 44, 51, 10, 18, 38, 32, 46, 41};
		int[] sortedArray2 = {2, 1, 9, 6, 4, 19, 15, 72, 53, 44, 51, 10, 18, 38, 32, 46, 41};
		Arrays.sort(sortedArray2);
		
		System.out.print("Array1: ");
		printArray(array);
		System.out.print("\nArray2: ");
		printArray(sortedArray2);
		
		//Setting target with maxIdx and minIdx
		int target = 19;
		int maxIdx = 12;
		int minIdx = 7;
		System.out.print("\n__________________");
		
		System.out.print("\nSequenSearch() method:");
		System.out.print("\nSearching "+ target + " in Array1.\n");
		System.out.print(SequenSearch(target,array)+" is the index of target in Array1.");
		
		System.out.print("\n__________________");
		
		System.out.print("\nBinarySearch() method:");
		System.out.print("\nSearching "+ target + " in Array2(sorted).\n");
		System.out.print(binarySearch(target,sortedArray2)+" is the index of target in Array2(sorted).");
		
		System.out.print("\n__________________");
		
		System.out.print("\nbinarySearchRecursive() method:");
		System.out.print("\nSearching "+ target + " in Array2(sorted) with max index is "+maxIdx+" and min index is "+minIdx+".\n");
		System.out.print(binarySearchRecursive(target,sortedArray2,minIdx,maxIdx)+" is the index of target in Array2(sorted).");

	}

}
