import java.util.*;

public class homework1 {
	public static void task1(String ope, double num1, double num2) {
		double result;
		//Using switch to scan the operator if it is valid then print the result
		switch (ope) {
		case "+":
			result = num1+num2;
			System.out.println("The result of "+num1+" + "+num2+" = "+result);
			break;
		case "-":
			result = num1-num2;
			System.out.println("The result of "+num1+" - "+num2+" = "+result);
			break;
		case "*":
			result = num1*num2;
			System.out.println("The result of "+num1+" * "+num2+" = "+result);
			break;
		case "/":
			result = num1/num2;
			System.out.println("The result of "+num1+" / "+num2+" = "+result);
			break;
		case "%":
			result = num1%num2;
			System.out.println("The result of "+num1+" % "+num2+" = "+result);
			break;
		default:
			System.out.println("The operator that you entered doesn't exist or it's support in Task1.");
		}
	}
	
	public static void task2(int segment, int height) {
		int space = segment+height-2; 
		int dot = 1;
		// because every change to next segment the dot and space will change so we have to make variables
		
		int spevar = height-2;
		for(int i = 0;i<segment;i++) {			//repeat of reach the number of segment we need
			for(int j =0;j<height;j++) {		//repeat of reach the height we need
				for(int s =0;s<(space-j);s++) {
					System.out.print(" ");
				}
				for(int d =0;d<(dot+(2*j));d++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			dot+=2;
			space-=1;
			//here the change for every segment
		}
		drawRoot(segment,height);
	}
	
	public static void drawRoot(int segment, int height) {		// draw Root
		for(int i=0;i<=(segment+height-3);i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=0;i<=(segment+height-3);i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=0;i<=(segment+height-6);i++) {
			System.out.print(" ");
		}
		System.out.println("*******");
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		task2(3,4);
	}

}
