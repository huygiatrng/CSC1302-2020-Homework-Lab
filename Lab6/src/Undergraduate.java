
public class Undergraduate extends Student{
	private boolean honors;
	
	public Undergraduate(String inMajor,double inGpa, int inCreditHours, boolean inHonors) {
		super(inMajor,inGpa,inCreditHours);
		this.honors = inHonors;
	}
	
	public boolean isHonors() {
		return honors;
	}
}
