package fraction;

class Fraction {
	int Numerator;
	int Denominator;
	
	Fraction (int numerator, int denominator) {
		Numerator = numerator;
		Denominator = denominator;
	}
	
	public String toString() {
		return Numerator + "/" + Denominator;
	}
	
	public void Sum(int n, int d) {
		System.out.println((Numerator * d) + (n * Denominator) + "/" + Denominator * d);
	}
	
	public void Sum(int n) {
		System.out.println(((n * Denominator) + Numerator) + "/" + Denominator);
	}
	
	public void Minus(int n, int d) {
		System.out.println((Numerator * d) - (n * Denominator) + "/" + Denominator * d);
	}
	
	public void Minus(int n) {
		System.out.println((Numerator - (n * Denominator)) + "/" + Denominator);
	}
	
	public void Prod(int n, int d) {
		System.out.println(Numerator * n + "/" + Denominator * d);
	}
	
	public void Prod(int n) {
		System.out.println(Numerator * n + "/" + Denominator);
	}

	public void Div(int n, int d) {
		System.out.println(Numerator * d + "/" + Denominator * n);
	}
	
	public void Div(int n) {
		System.out.println(Numerator + "/" + Denominator * n);
	}
}

public class Program {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
//		f1.Prod(2,3);
//		System.out.println(f1.FindDenominator(7, 3));
		
		f1.Div(3);
	}

}
