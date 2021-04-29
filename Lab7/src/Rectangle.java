
public class Rectangle implements Comparable<Rectangle> {
	private int height;
	private int width;
	private Point topCorner;
	
	public Rectangle(int inHeight, int inWidth, Point inTopCorner) {
		height = inHeight;
		width = inWidth;
		topCorner = inTopCorner;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getTopCorner() {
		return topCorner;
	}
	
	public int compareTo(Rectangle rc){
		if(this.height == rc.height) {
			if(this.width == rc.width) {
				return topCorner.compareTo(rc.topCorner);
			}else{
				return this.width-rc.width;
			}
		}else{
			return this.height-rc.height;
		}
	}
	
	public String toString() {
		return +height+","+width+","+topCorner.toString();
	}
	
	

}
