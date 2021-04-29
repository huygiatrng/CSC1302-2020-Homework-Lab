
public class RectangleClient {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.setFields(1,2,12,13);
		r2.setFields(3,8,15,14);
		
		System.out.println("RECTANGLE 1:");
		System.out.print("X in the first rectangle:");
		System.out.println(r1.getX());
		System.out.print("Y in the first rectangle:");
		System.out.println(r1.getY());
		System.out.print("Width in the first rectangle:");
		System.out.println(r1.getWidth());
		System.out.print("Height in the first rectangle:");
		System.out.println(r1.getHeight());
		System.out.println(r1.toString());
		System.out.println("*****************\n");
		
		System.out.println("RECTANGLE 2:");
		System.out.print("X in the second rectangle:");
		System.out.println(r2.getX());
		System.out.print("Y in the second rectangle:");
		System.out.println(r2.getY());
		System.out.print("Width in the second rectangle:");
		System.out.println(r2.getWidth());
		System.out.print("Height in the second rectangle:");
		System.out.println(r2.getHeight());
		System.out.println(r2.toString());
		System.out.println("*****************\n");
	}

}
