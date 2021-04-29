import java.util.*;

public class Lab2 {
	public static int[] printReverse(int arr[]) {
		int arr2[] = new int[10];
		for(int i=0; i<10;i++) {
			arr2[i]=arr[(9-i)];
		}
		return arr2;
	}
	
	public static int getLargest(int arr[]) {
		int largest=arr[0];
		for(int i=1; i<10;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static int[] computeTwice(int arr[]) {
		int arr2[] = new int[10];
		for(int i=0;i<10;i++) {
			arr2[i] = 2* arr[i];
		}
		return arr2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		int number;
		for(int i=0; i<10;i++) {
			System.out.println("Enter the number:");
			number = input.nextInt();
			arr[i]=number;
		}
		
		arr = printReverse(arr);
		
		System.out.print("Here the array in reverse: ");
		for(int i=0; i<9;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[9]);
		
		System.out.println("The highest valued element: "+ getLargest(arr));
		
		arr = computeTwice(arr);
		
		System.out.print("The array with two times each element: [");
		for(int i=0; i<9;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println(arr[9]+"]");
		
	}

}
