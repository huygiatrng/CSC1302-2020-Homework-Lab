
public class Rectangle {
	
	public int x;
	public int y;
	public int width;
	public int height;
	
	
	public void setFields(int newx, int newy, int newwidth, int newheight) {
		x = newx;
		y = newy;
		height = newwidth;
		width = newheight;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width; 
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return String.format("Rectangle [x=%d, y=%d, height=%d, width= %d] Area is %d",x,y,height,width,height*width);
	}

}
