
public class Graduate extends Student{
	private String degree;
	private String concentration;
	private int years;
	
	public Graduate(String inMajor,double inGpa, int inCreditHours, String inDegree, String inConcentration, int inYears) {
		super(inMajor,inGpa,inCreditHours);
		this.degree = inDegree;
		this.concentration = inConcentration;
		this.years = inYears;
	}
	
	public int getYears() {
		return this.years;
	}
	
	public String getDegree() {
		return this.degree;
	}
	
	public String getConcentration() {
		return this.concentration;
	}
}
