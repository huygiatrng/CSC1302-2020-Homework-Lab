import java.util.*;

public class IncomeTax {
	
	//Methods to return tax for cases	
	public static double firstOp(double income) {
		return (income/100);
	}
	public static double secondOp(double income) {
		return (7.5+(income-750)*2/100);
	}
	public static double thirdOp(double income) {
		return (82.5 +(income-2500)*4/100);
	}
	public static double fourthOp(double income) {
		return (142.5+(income-5000)*5/100);
	}
	public static double fifthOp(double income) {
		return (230+(income-8000)*6/100);
	}
	
	//Method for making decision (which equation should be used)
	public static double taxSelect(double income) {
		if(income<=750){
			return firstOp(income);
		}else if(income<=2500){
			return secondOp(income);
		}else if(income<=5000){
			return thirdOp(income);
		}else if(income<=8000){
			return fourthOp(income);
		}else {
			return fifthOp(income);
		}
	}
	
	//Method to check every number in a array to return the largest
	public static double maxTax(double[] taxes) {
		double maxTax = 0;
		for(int i = 0; i<taxes.length;i++) {
			if(maxTax<taxes[i]) {
				maxTax=taxes[i];
			}
		}
		return maxTax;
	}
	
	//Main
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int amountOfPeople = rand.nextInt(15)+1;
		double[] peopleIncome = new double[amountOfPeople];
		double[] peopleTaxes = new double[amountOfPeople];
		double income = 0;
		
		
		System.out.printf("There are %d people need to enter income:\n",amountOfPeople);
		for(int i = 0;i<amountOfPeople;i++) {
			System.out.printf("   Please enter income of person number %d: $",(i+1));
			income = input.nextDouble();
			peopleIncome[i] = income;
			System.out.println("      Tax: $"+ taxSelect(income));
			peopleTaxes[i] = taxSelect(income);
		}
		
		
		//Print people who have largest tax. 
		System.out.print("The people(person) number ");
		int count = 1;
		for(int i = 0;i<amountOfPeople;i++) {
			if(peopleTaxes[i]==maxTax(peopleTaxes)) {
				if(count > 1) {  							//if the number of people have largest is greater than 1
					System.out.printf("and %d ",(i+1));
				}else {
					System.out.printf("%d ",(i+1));
					count += 1;
				}
			}
		}
		System.out.printf("have(has) the max value of taxes, which is $%.2f\n",maxTax(peopleTaxes));
		
		
		
	}

}
