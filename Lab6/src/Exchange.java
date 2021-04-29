
public class Exchange extends Undergraduate{
	private String country;
	private String year;
	
	public Exchange(String inMajor,double inGpa, int inCreditHours, boolean inHonors, String inCountry, String inYear) {
		super(inMajor,inGpa,inCreditHours,inHonors);
		country = inCountry;
		year = inYear;
	}
	
	public String getExchangeYear() {
		return year;
	}
	
	
	public String getCountry() {
		return country;
	}

}
