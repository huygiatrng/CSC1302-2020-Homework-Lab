public class AdvanceTicket extends Ticket {
	private int daysInAdvance;
	
	public AdvanceTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
	}
	
	public double getPrice() {
		if (daysInAdvance >= 10) {
			return 30.00;
		} else {
			return 40.00;
		}
	}
}