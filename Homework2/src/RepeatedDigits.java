import java.util.*;

public class RepeatedDigits {
	
	//Method to return the array that count digits from 0-9
	public static int[] countDigits(long number) {
		String str = Long.toString(number);								//I convert long to string, then use charAt(i) to check every digit
		int[] result = new int[10];
		
		for(int i = 0;i<str.length();i++) {
			for(int j = 0;j<10;j++) {
				if(Character.getNumericValue(str.charAt(i))==j) {		// or str.charAt(i)==Integer.toString(j)
					result[j]+=1;
				}
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:	 ");
		long number = input.nextLong();									//I use long because it can storage larger integer than int => we can we can store more digit
		
		while(number>0) {  												//the below only run if input > 0
			
			int[] result=countDigits(number);							//get the array of results
			
			//print out results
			System.out.printf("\n%-16s"," Digit:");
			for(int i =0;i<10;i++) {
				System.out.printf("%-2d", i);
			}
			System.out.printf("\n%-16s","Occurrances:");
			for(int i =0;i<10;i++) {
				System.out.printf("%-2d",result[i]);
			}
			
			//Ask for next loop
			System.out.print("\n\nEnter a number:	 ");
			number = input.nextLong();
		}

	}

}
