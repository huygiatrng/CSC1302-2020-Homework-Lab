public class StudentAdvanceTicket extends AdvanceTicket {
	
	public StudentAdvanceTicket(int number, int daysInAdvance) {
		super(number, daysInAdvance);
	}
	
	public double getPrice() {
		return super.getPrice() / 2;
	}
	
	public String toString() {
		return super.toString() + " (ID required)";
	}
}