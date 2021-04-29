import java.util.*;

public class quizz {
	public static boolean test(int n) {
		while (n != 0) {

	        if (n % 2 == 0) {   

	            return false;

	        }

	        n = n / 10;

	    }

	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int number = rand.nextInt(10) + 3;
		System.out.println(true&&false);
		System.out.println(!(false == true));
		System.out.println(false||true);
		System.out.println(false != true);
		System.out.println(test(127));
	}

}
