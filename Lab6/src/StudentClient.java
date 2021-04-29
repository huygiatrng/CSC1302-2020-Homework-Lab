
public class StudentClient {

	public static void main(String[] args) {
		Undergraduate Alex = new Undergraduate("CS",3.9,54,true);
		
		Graduate Mary = new Graduate( "Computer Science" ,3.91, 54,"Master","Data Science",1 );
		
		Exchange YingShu = new Exchange("Finance",3.85, 62, false,"Tiawan","Fall 2020" );
		
		System.out.println("Alex Honor: " + Alex.isHonors());
		System.out.println("");
		System.out.println("Mary Major: " +Mary.getMajor());
		System.out.println("Mary Concentration: " +Mary.getConcentration());
		System.out.println("Mary Year: " +Mary.getYears());

		
		System.out.println("");
		System.out.println("YingShu GPA: " +YingShu.getGpa());
		System.out.println("YingShu Major: " +YingShu.getMajor());
		System.out.println("YingShu Country: " +YingShu.getCountry());
		
	}

}
