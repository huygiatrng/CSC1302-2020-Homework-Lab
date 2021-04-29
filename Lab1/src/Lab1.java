import java.util.*;

public class Lab1 {
	
	public static void print() {
		for(int i = 1;i<=5;i++) {
			for(int j =5;j>(5-i);j--) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	public static boolean isSorted(int[] arr) {
		boolean valid = true;
		int size = arr.length;
		for(int i =0;i<size-1;i++){
			if(arr[i] > arr[(i+1)]) {
				System.out.println(arr[i]+" and "+arr[(i+1)]);
				valid = false;
				break;
			}
		}
		if(valid==true){
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Problem 1:");
		print();
		System.out.println("Problem 2:");
		System.out.println("Enter the number of element you want to enter:");
		int size = input.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Please enter element number "+(i+1)+":");
			int j = input.nextInt();
			arr[i]=j;
		}
		System.out.println(isSorted(arr));
	
	}
}
