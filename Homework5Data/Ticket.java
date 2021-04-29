// Superclass for all types of tickets.
public abstract class Ticket {
private int number;
public Ticket(int number) {
this.number = number;
}
public abstract double getPrice();
public String toString() {
return "Number: " + this.number +
", Price: " + this.getPrice();
}
}
5.
public class WalkupTicket extends Ticket {
public WalkupTicket(int number) {
super(number);
}
public double getPrice() {
return 50.00;
}
}
6.
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
7.
// Represents a student ticket purchased ahead of time.
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
8.