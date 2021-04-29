
public class ColoringPoint extends Point implements Coloring{
	public String color = "default_color";
	public int x;
    public int y;
	
	public String getColor() {
		return color;
	}
	
	
    public boolean equals(Object o) {
        if (o instanceof Point) {
        	ColoringPoint other = (ColoringPoint) o;
            return getX() == other.getX() && getY() == other.getY() && color.equals(other.color); //TRUE if they are the same
        } else {  
            return false;
        }
    }
    
	
	public String toString() {
		return "(" + getX() + ", " + getY() + "), color: "+ color;
	}
}