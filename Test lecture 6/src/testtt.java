import java.util.*;
package graphics;
import java.awt.*;

public class testtt {
	public static void main(String[] args) {
		DrawingPanel panel1 = new DrawingPanel(80, 50);
		DrawingPanel panel2 = panel1;   // same window
		panel2.setBackground(Color.CYAN);
	}
}
