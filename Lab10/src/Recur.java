
public class Recur {

	public static void main(String [] args){
		print(5);
		System.out.println("Question 2");
		System.out.println(cumulativeSum(7));
		System.out.println("Question 3");
		System.out.println(fib(7));
		
	}
	
      public static void print(int n) {
	     if (n!=0){
		print(n-1);
	     	printNum(n);
		System.out.println();
		}
      }

      public static void printNum(int n){
    	  if(n!=0){
			printNum(n-1);
			System.out.print(n+ n+ " ");
    	  }
      }
      public static int cumulativeSum(int n) {
    	  
    	  if(n!=0) {
    		  n=n+cumulativeSum(n-1);
    	  }
    	  return n;
      }
      
      public static int fib(int n) {
    	  if(n>1) {
    		  return fib(n - 1) + fib(n - 2);
    	  }else {
    		  return n;
    	  }
      }

}
