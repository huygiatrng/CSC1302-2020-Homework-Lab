
public class Square {
	private int x,y, sideLength;
	
	public Square(int inx,int iny) {
		x = inx;
		y = iny;
		sideLength = 5;
	}
	
	public Square(int side) {
		x = 0;
		y = 0;
		sideLength = side;
	}
	
	public Square() {
		x = 0;
		y = 0;
		sideLength = 5;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSide() {
		return sideLength;
	}
	
	public String toString() {
		return ("Square has location:("+x+","+y+") and its side length is "+sideLength);
	}
	
}
