import java.awt.Color;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class test1drawing {

	public static void main(String[] args) {

		DrawingPanel window = new DrawingPanel(500, 500);
		window.setBackground(Color.YELLOW);
		example(window);
		

	}
	public static void example(DrawingPanel panel) {
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		panel.setBackground(Color.CYAN);
	}

}
