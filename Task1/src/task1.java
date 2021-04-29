import java.util.*;

public class task1 {
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2;
		String ope;
		System.out.print("Enter operation:");
		ope = input.nextLine();
		System.out.print("Enter first number:");
		num1 = input.nextDouble();
		System.out.print("Enter second number:");
		num2 = input.nextDouble();
		task1(ope,num1,num2);

	}
}
