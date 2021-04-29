
public class PaypalAccount {
	private static int numOfAcc=0;
	private double balance;
	private String accountID;

	public PaypalAccount (){
		numOfAcc++;
		accountID = String.format("%03d", numOfAcc);
		balance = 0;
	}
 
	public PaypalAccount (double bal){
		numOfAcc++;
		accountID = String.format("%03d", numOfAcc);
		balance = bal;
	}
	
	public void setBal(double bal) {
		balance = bal;
	}
	public void setID(String id) {
		accountID = id;
	}
	
	public double getBal(){
		return balance;
	}
	
	public String getID(){
		return accountID;
	}

	public String toString() {
		return "Account [balance=" + balance + ", accountID=" + accountID + "]";
	}
}
