import java.util.*;


public class Bank {	
	//method to find average balance
	public static double findAverageBalance(ArrayList<PaypalAccount> accounts) {
		double sum = 0;
		for(PaypalAccount account : accounts) {
			sum+= account.getBal();
		}
		sum = sum/accounts.size();
		return sum;
	}
	//method to find largest balance
	public static void findLargestBal(ArrayList<PaypalAccount> accounts) {
		double maximum = 0;
		int i = -1;
		int largest_index = 0;
		for(PaypalAccount account : accounts) {
			i++;
			if(account.getBal()>maximum) {
				maximum = account.getBal();
				largest_index = i;
			}
		}
		System.out.println("The account with the largest balance: accountID = "+accounts.get(largest_index).getID()+", balance = $"+accounts.get(largest_index).getBal());
	}
	//method to find lowest balance
	public static void findLowestBal(ArrayList<PaypalAccount> accounts) {
		double minimum = accounts.get(0).getBal();
		int i = -1;
		int lowest_index = 0;
		for(PaypalAccount account : accounts) {
			i++;
			if(account.getBal()<minimum) {
				minimum = account.getBal();
				lowest_index = i;
			}
		}
		System.out.println("The account with the lowest balance: accountID = "+accounts.get(lowest_index).getID()+", balance = $"+accounts.get(lowest_index).getBal());
	}
	//round double
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	//main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		ArrayList<PaypalAccount> accounts = new ArrayList<PaypalAccount>();
		System.out.print("Enter the number of accounts to generate: ");
		int numOfAccount = input.nextInt();
		for(int i = 0; i< numOfAccount;i++) {
			accounts.add(new PaypalAccount(round((rand.nextInt(10010)*0.1)-1,2))); //random the balance of accounts by take randomly a number from 10010 then multiply with 0.1
		}																		//=> It will create a random double from 1.0 to 1001.0 => minus 1 to make it become 0.0 to 1000.0
		//print accounts details
		System.out.println(accounts);
		
		//Set pantherID
		String pantherID = "002-53-0622";
		//remove - in pantherID
		String pantherID2 = pantherID.replaceAll("-","");
		//take abc part in pantherID
		String pantherAcId = pantherID.substring(0,3);
		
		boolean checkAval = false; // variable to check if their is a account with balance has the accountID is "abc" of pantherID
		double pantherBal;
		
		// Task a
		for(PaypalAccount account : accounts) {
			if (account.getID().equals(pantherAcId)){
				checkAval = true;
				pantherBal = account.getBal();
				//This is the text would be return in part a, which just find the balance of accounts have account ID is abc of pantherID
				//System.out.println("My Panther ID is "+ pantherID +"; my bank account ID is "+ pantherAcId +" and balance is: $"+pantherBal);
				break;
			}
		}
		if(checkAval != true) {
			accounts.get(numOfAccount-1).setBal(accounts.get(0).getBal());
			pantherBal = accounts.get(numOfAccount-1).getBal();
			//This is the text would be return in part a, which just find the balance of accounts have account ID is abc of pantherID 
			/* ( when we can't found and set the last account in the array as abc;
			 *  transfer all the balance of the first account to the account with accountID of abc)
			 */
			//System.out.println("My Panther ID is "+ pantherID +"; my bank account ID is "+ pantherAcId +" and balance is: $"+pantherBal);
		}
		
		//Task b
		pantherBal = (Integer.parseInt(pantherID2.substring(pantherID2.length()-5,9)))*0.01;
		
		for(PaypalAccount account : accounts) {
			if (account.getID().equals(pantherAcId)){
				account.setBal(pantherBal);
				//This is the text would be return in part b
				System.out.println("My Panther ID is "+ pantherID +"; my bank account ID is "+ account.getID() +" and balance is: $"+account.getBal());
				break;
			}
		}
		
		//Task c
		System.out.printf("The average balance is: $%.2f\n",findAverageBalance(accounts));
		//Task d
		findLargestBal(accounts);
		//Task e
		findLowestBal(accounts);
	}

}
