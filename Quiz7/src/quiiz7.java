import java.util.Scanner;

public class quiiz7 {
	public static void printNum(int n) {

	    if (n == 0) {

	        System.out.println();

	    } else {

	        System.out.print(n);

	        printNum(n - 1);

	    }

	}

	public static void main(String[] args) {
		printNum(3);
	}

}
