//Name: Gia-Huy Truong
//PantherID: 002-530-622
//Due Date: Feb 9
//=======================================
import java.util.*;

public class Lab4 {
	
	public static int minGap(int[] arr) {
		if(arr.length<1) {
			return 0;
		}else {
			int miniGap= Math.abs(arr[0]-arr[1]);
			for(int i =1; i<arr.length-1;i++) {
				if(Math.abs(arr[i]-arr[i+1])<miniGap) {
					miniGap = Math.abs(arr[i]-arr[i+1]);
				}
			}
			return miniGap;
		}
	}

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter an array of integers\nHow many elements:");
			int numberOfElement = input.nextInt();
			int[] arr = new int[numberOfElement];
			System.out.println("What are the elements:");
			for(int i=0;i<arr.length;i++) {
				arr[i]= input.nextInt();
			}
			System.out.print(minGap(arr));
		}
	}
}
