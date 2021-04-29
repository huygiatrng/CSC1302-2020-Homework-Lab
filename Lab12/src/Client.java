import java.util.*;

public class Client {

	public static void main(String[] args) {
		
		int[] arr = {-4, 2, 7, 9, 15, 19};


		int ind = Arrays.binarySearch(arr, 0, 6, 12);
		System.out.print(ind);
	}

}
