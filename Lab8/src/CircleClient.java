
public class CircleClient {

	public static void main(String[] args) {
		Point p1 = new Point(10,5);
		Circle c1 = new Circle(p1,7);
		Point p2 = new Point(5,7);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(c1);
		
		if(c1.contains(p2)==false) {
			System.out.print("("+p2.getX()+","+p2.getY()+") does not lie within the circle");
		}else {
			System.out.print("("+p2.getX()+","+p2.getY()+") lies within the circle");
		}
	}

}
