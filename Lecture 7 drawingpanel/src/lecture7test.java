import DrawingPanel.DrawingPanel;
import java.awt.*;

public class lecture7test {
	
	public static void drawBook(Graphics g,int x, int y, int z) {
		g.setColor(Color.CYAN);            // cyan background
        g.fillRect(x, y, z, z);

        g.setColor(Color.WHITE);           // white "bjp" text
        g.drawString("BJP", x+z/2, y+z/5);

        g.setColor(new Color(191, 118, 73));
        for (int i = 0; i < 10; i++) {     // orange "bricks"
            g.fillRect(x, y + z/10 * i, z/10 * (i + 1), z/10 - 1);
        }
	}
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(520,240);
		Graphics g = panel.getGraphics();
		
		
        drawBook(g,20,35,100);
        drawBook(g,150,70,60);
        drawBook(g,300,10,200);
        panel.sleep(200);
        g.setColor(Color.BLUE);
        for (int i = 1; i <= 10; i++) {
            g.fillOval(15 * i, 15 * i, 30, 30);
            panel.sleep(500);
        }


	}
	
}
