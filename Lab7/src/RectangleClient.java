import java.util.ArrayList;
import java.util.Collections;


public class RectangleClient {
	public static void main(String[] args) {

		

		ArrayList<Rectangle> Array1 = new ArrayList<Rectangle>();
			
		
		Array1.add(new Rectangle(3,5, new Point(7,5) ));
		Array1.add(new Rectangle(7,12, new Point(17,15) ));
		Array1.add(new Rectangle(8,19, new Point(7,10) ));
		Array1.add(new Rectangle(7,15, new Point(7,5) ));
		Array1.add(new Rectangle(6,9, new Point(17,5) ));
		Array1.add(new Rectangle(3,5, new Point(19,21) ));
		Array1.add(new Rectangle(7,15, new Point(5,85) ));
		Array1.add(new Rectangle(8,52, new Point(9,45) ));
		Array1.add(new Rectangle(2,5, new Point(7,7) ));
		Array1.add(new Rectangle(13,15, new Point(7,25) ));
		
		System.out.println(Array1);
		
		Collections.sort(Array1, (r1, r2) -> r1.compareTo(r2));
		
		System.out.println("Sorted:\n"+ Array1);
	}
}
