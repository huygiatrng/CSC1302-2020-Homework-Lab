//Name: Gia Huy Truong
//Date: 2/17/2021
//Homework3 - Task 2: Draw the pictures according to the sample.
//Task 2 files: Task2.java     DrawingPanel.java


import java.awt.*;


public class Task2 {
	
	public static void drawBox(Graphics g, int x, int y, int size, int circles, int row, int col ) {
		
		int r = size/2/circles;	// this is the distance each time x and y will move further after drawing each circle. It also equals radius of every circle
		int a = x; //temporary variable to return x after completing a row.
		
		
		for(int i = 0; i<row;i++) {					//loop 2 times with temporary variable
			for(int j =0; j<col;j++) {
				
				//draw Rectangle
				g.setColor(Color.BLACK);
				g.drawRect(x,y,size,size);
				g.setColor(Color.GREEN);
				g.fillRect(x,y,size,size);
				
				//draw circles
				for(int c = 0;c<circles;c++) {
					g.setColor(Color.BLACK);
					g.drawOval(x+c*r,y+c*r,size-(r*2*c),size-(r*2*c));
					g.setColor(Color.YELLOW);
					g.fillOval(x+c*r,y+c*r,size-(r*2*c),size-(r*2*c));
				}
				
				// draw diagonal and vertical line, horizontal line
				g.setColor(Color.BLACK);
				g.drawLine(x+size/2,y,x+size/2,y+size);
				g.drawLine(x,y+size/2,x+size,y+size/2);
				g.drawLine(x,y,x+size,y+size);
				g.drawLine(x+size,y,x,y+size);
				
				x = x+size;				// x moves after every drawing
			}
			x = a;						// x turns back to first position and y will move as x did.
			y = y + size;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(400, 400);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.CYAN);
		
		drawBox(g,0,0,100,5,1,1);
		
		drawBox(g,10,120,24,4,5,5);
		
		drawBox(g,150,20,40,5,6,6);
		
		drawBox(g,130,275,36,3,3,3);
		
	}

}
