
public class Main {

	public static void main(String[] args) {
		WalkupTicket walkupuser = new WalkupTicket(17);
		System.out.println("6:Walkup Ticket Test\n"+walkupuser+"\n******");
		//*****
		System.out.println("7:Advance Ticket Test");
		AdvanceTicket advanceTic1 = new AdvanceTicket(21,3);
		AdvanceTicket advanceTic2 = new AdvanceTicket(25,12);
		System.out.println(advanceTic1);
		System.out.println(advanceTic2+"\n******");
		//*****
		System.out.println("8: Student Advance Ticket Test");
		StudentAdvanceTicket studentAdTic1= new StudentAdvanceTicket(32,7);
		StudentAdvanceTicket studentAdTic2= new StudentAdvanceTicket(35,15);
		System.out.println(studentAdTic1);
		System.out.println(studentAdTic2);
	}

}
