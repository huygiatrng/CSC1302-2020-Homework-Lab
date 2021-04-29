import java.util.*;


public class FractionScale {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("This program performs the scaling operations on a fraction.\nEnter the fraction: ");
		
		//Input as String
		String fract = input.nextLine();
		
		//Then the input will be trimmed by remove all the spaces if they exist
		fract = fract.replaceAll("\\s", "");
		
		
		Fraction fraction1 = fractionCheck(fract);
		System.out.print("Scale up or down (1: up, 0: down): ");
		int scaleFlag = input.nextInt();
		System.out.print("Enter a scale factor: ");
		int scaleFac = input.nextInt();
		fraction1.scale(checkFlag(scaleFlag),scaleFac);
		System.out.print("Scaled fraction: "+fraction1);
	}
	
	
	// METHODS:
	// Check flag
	public static boolean checkFlag(int flag) {
		if(flag==1) {
			return true;
		}else{
			return false;
		}
	}
	
	// method to check the area before and after slash (including if there is no slash or slash is at after or before all integer. Then return Fraction object with processed integer
 	public static Fraction fractionCheck(String str) {
		if (str.contains("/")==false){
			if(isInteger(str)==true){
				return new Fraction(Integer.parseInt(str));
			}
		}else {
			if(countSlash(str)==1) {
				if(str.indexOf("/")==str.length()-1) {
					if(isInteger(str.substring(0,str.length()-2))==true) {
						return new Fraction(Integer.parseInt(str.substring(0,str.length()-1)));
					}
				}else if(str.indexOf("/")==0) {
					if(isInteger(str.substring(1,str.length()))==true) {
						return new Fraction(0,Integer.parseInt(str.substring(1,str.length())));
					}
				}else {
					if((isInteger(str.substring(0,str.indexOf("/")))==true)&&(isInteger(str.substring(str.indexOf("/")+1,str.length()))==true)) {
						return new Fraction(Integer.parseInt(str.substring(0,str.indexOf("/"))),Integer.parseInt(str.substring(str.indexOf("/")+1, str.length())));
					}
				}
			}
		}
		return new Fraction();
	}
	
 	//method to count number of slash in input
	public static int countSlash(String str) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == '/') {
		        count++;
		    }
		}
		return count;
	}
	
	//method to checking if processed integers are valid to create a fraction
	public static boolean isInteger(String str) {
	    if (str == null) {
	        return false;
	    }
	    int length = str.length();
	    if (length == 0) {
	        return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') {
	        if (length == 1) {
	            return false;
	        }
	        i = 1;
	    }
	    for (; i < length; i++) {
	        char c = str.charAt(i);
	        if (c < '0' || c > '9') {
	            return false;
	        }
	    }
	    return true;
	}


}
