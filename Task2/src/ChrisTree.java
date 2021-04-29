import java.util.*;

public class ChrisTree {
	public static void task2(int segment, int height) {
		int space = segment+height-2; 
		int dot = 1;
		// because every change to next segment the dot and space will change so we have to make variables
		
		int spevar = height-2;
		for(int i = 0;i<segment;i++) {			//repeat of reach the number of segment we need
			for(int j =0;j<height;j++) {		//repeat of reach the height we need
				for(int s =0;s<(space-j);s++) {
					System.out.print(" ");
				}
				for(int d =0;d<(dot+(2*j));d++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			dot+=2;
			space-=1;
			//here the change for every segment
		}
		drawRoot(segment,height);
	}
	
	public static void drawRoot(int segment, int height) {		// draw Root
		for(int i=0;i<=(segment+height-3);i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=0;i<=(segment+height-3);i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		for(int i=0;i<=(segment+height-6);i++) {
			System.out.print(" ");
		}
		System.out.println("*******");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of segments:");
		int segment = input.nextInt();
		System.out.print("Enter height:");
		int height = input.nextInt();
		System.out.println("Here is the CHRISTMAS TREE:\n\n");
		task2(segment,height);
		
	}

}
