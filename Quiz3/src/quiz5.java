import DrawingPanel;
public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 669260267;
		int[] counts = new int[10];

		while (n > 0) {

		      int digit = n % 10;

		      counts[digit]++;

		      n = n / 10;
		 
		}
		System.out.println(counts[6]);
		
	}

}
