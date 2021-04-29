
public class ColoringClient {
	public static void main(String[] args) {
		ColoringPoint CP_Blue = new ColoringPoint();
		CP_Blue.color = "blue";
		CP_Blue.setLocation(15,17);
		
		ColoringPoint CP_Orange = new ColoringPoint();
		CP_Orange.color = "orange";
		CP_Orange.setLocation(13,19);
		
		System.out.println(CP_Blue.getColor());
		System.out.println(CP_Orange.getColor());
		System.out.println(CP_Blue.equals(CP_Orange));
	}
}
