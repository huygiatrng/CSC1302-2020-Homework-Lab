import java.util.*;

public class Swap {
	public static int countDigit(int num) { 		//Method to count digits of number
		int count=0;
		while (num != 0) {
			num /= 10;
			++count;
		}
		return count;
	}
	public static int countLetter(String str) {		//Method to count letters of String
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			   if (Character.isLetter(str.charAt(i)))
			   count++;
		}
		return count;
	}
	
	public static int swapDigitPairs(int num) {
		int result = 0;
		int a,b;
		int count = countDigit(num);											//I decided to assign num repeatedly, so I created a var to store count digit
		
		for(int i=1;i<count;i+=2) {
			a = num%10;															
			num /= 10;
			b = num%10;
			num/= 10;															// we take 2 digits every time from right to left
			result += (a*(Math.pow(10, (i)))) + (b*(Math.pow(10, (i-1))));		// then swap it by multiple both with 10 in 2 different power (base on i to get higher power)
		}
								/* We're done with all digits need to be swapped
								Now we need to check if the count digit is odd or even, and finish the last digit if it exists*/
		if(count%2==1) {
			a = num%10;
			result += a*(Math.pow(10, count-1));
		}
		return result;
	}

	
	public static String swapLetterPairs(String str) {
		int count = countLetter(str);
		int j = 0;
		String result = "";
		char a, b;
		if(count%2==1) {
			j+=1;
			result = result + str.charAt(0);
		}
		// j was created to check if countletter is odd or even to locate what the loop start, if it is odd, we add the first letter(index =0) to result and start with the second letter of string (index =1)
		for(int i =j;i<count;i+=2) {
			result = result + str.charAt(i+1) + str.charAt(i);
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a number to be swapped:");
		int number = input.nextInt();
		System.out.println("The swapped result is: "+ swapDigitPairs(number));
		System.out.println("\n*************");
		System.out.print("Please input a string to be swapped:");
		String str = input.next();
		System.out.print("The swapped result is: "+ swapLetterPairs(str));
		
		
		
		

	}

}
