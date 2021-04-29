import java.util.*;

public class Lab9 {
	
	public static ArrayList<String> removeOddLength(ArrayList<String> strs){
		String str;
		for(int i = 0;i<strs.size();i++) {
			str = strs.get(i);
			if(str.length()%2==1) {
				strs.remove(i);
				i--;
			}
		}
		return strs;
	}
	
	public static ArrayList<String> swapPairs(ArrayList<String> strs){
		String str;
		for(int i = 1; i < strs.size();i+=2) {
			str = strs.get(i);
			strs.set(i, strs.get(i-1) );
			strs.set(i-1, str);
		}
		return strs;
	}
	
	public static ArrayList<Integer> intersect(ArrayList<Integer> strs1,ArrayList<Integer> strs2){
		ArrayList<Integer> strs = new ArrayList<Integer>();
		for(int i=0;i<strs1.size();i++) {
			for(int j=0;j<strs2.size();j++) {
				if(strs1.get(i).equals(strs2.get(j))) {
					strs.add(strs1.get(i));
				}
			}
		}
		return strs;
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("1");
		str1.add("12");
		str1.add("123");
		str1.add("1234");
		str1.add("12345");
		str1.add("123456");
		str1.add("1234567");
		str1.add("12345678");
		str1.add("123456789");
		str1.add("1234567890");
		System.out.println("Array of Strings before :"+str1);
		System.out.println("Array of Strings after method1:"+removeOddLength(str1));
		System.out.println("Array of Strings after method2:"+swapPairs(str1));
		
		
		ArrayList<Integer> str2 = new ArrayList<Integer>();
		str2.add(8);
		str2.add(9);
		str2.add(1);
		str2.add(11);
		str2.add(15);
		str2.add(4);
		str2.add(17);
		str2.add(41);
		str2.add(28);
		str2.add(59);
		
		ArrayList<Integer> str3 = new ArrayList<Integer>(); 
		str3.add(7);
		str3.add(4);
		str3.add(20);
		str3.add(28);
		str3.add(23);
		str3.add(11);
		str3.add(17);
		str3.add(19);
		str3.add(37);
		str3.add(81);
		str3.add(59);

        str2.sort((o1, o2) -> o1 - o2);
        str3.sort((o1, o2) -> o1 - o2);
        System.out.println("______________\n2 arrays of integers before method3:");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("arrays of integers after method3:");
        System.out.println(intersect(str2,str3));
	}

}
