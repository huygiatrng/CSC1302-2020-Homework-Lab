
public class Student {
	private String major;
	private double gpa;
	private int creditHours;
	
	public Student(String inMajor,double inGpa, int inCreditHours) {
		major = inMajor;
		gpa= inGpa;
		creditHours = inCreditHours;
	}
	
	public String getMajor() {
		return major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public String getYear() {
		if(creditHours<32) {
			return "Freshmen";
		}else if(creditHours>=32&&creditHours<64) {
			return "Sophomore";
		}else if(creditHours>=64&&creditHours<96) {
			return "Junior";
		}else {
			return "Senior";
		}
	}
}
