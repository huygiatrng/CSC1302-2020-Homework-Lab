//Point class
public class Point {
    private int x;
    private int y;
    
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        setLocation(x, y);
    }
    
    //compare the x and y of two points
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y; //TRUE if they are the same
        } else {  
            return false;
        }
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


