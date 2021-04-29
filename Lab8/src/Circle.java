public class Circle extends Point {
	private Point p;
	private int radius;
	public Circle(Point pin, int radiusin) {
		int x= pin.getX();
		int y= pin.getY();
		p = new Point(x,y);
		radius = radiusin;
	}
	public Point getCenter() {
		return p;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String toString() {
		return ("Circle[center=("+p.getX()+","+p.getY()+"),radius="+radius+"]");
	}
	
	public boolean contains(Point pother) {
		double distance = p.distanceOf(pother);
		if(distance>radius) {
			return false;
		}else {
			return true;
		}
	}

}
