
public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int num, int denom) {
		 numerator = num;
		 denominator = denom;
	}
	
	public Fraction() {
		numerator =0;
		denominator =1;
	}
	
	public Fraction(int num) {
		numerator = num;
		denominator =1;
	}
	
	public Fraction scaleUp(int factor) {
		int num = numerator*factor;
		return new Fraction(num,denominator);
	}
	
	public Fraction scaleDown(int factor) {
		
		int denom = denominator*factor;
		return new Fraction(numerator,denom);
	}
	
	public void scale(boolean flag, int factor) {
		if(factor ==0) {
			System.out.print("**WARNING**: Factor = 0\n");
		}else {
			if (flag==true){
				numerator = scaleUp(factor).numerator;
				denominator = scaleUp(factor).denominator;
			}else {
				numerator = scaleDown(factor).numerator;
				denominator = scaleDown(factor).denominator;
			}
		}
	}
	
	public String toString() {
		return (numerator+"/"+denominator);
	}
	
	// Instance methods
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	
	public Fraction divide(Fraction f) {
		int num = numerator * f.demominator;
		int denom = demominator * f.numerator;
		return new Fraction(num,denom);
	}
	
	
	
	public Fraction add(Fraction f) {
		int num = numerator * f.denominator +
		f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction(num, denom);
	}
}
