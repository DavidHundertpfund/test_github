package Aufgabe6;

public class Divisondurch0 {
	
	public static double divide(double x, double y) {
		if(y==0) {
			throw new ArithmeticException("Darf nicht durch 0 dividieren");
		}
					return x / y;
	}
		
	
	

	public static void main(String[] args) {
	try {
		double i = divide(2,0);
		System.out.println("Ergebnis: " + i);
	}catch(ArithmeticException e) {
		System.out.println("durch 0 kann man nicht teilen");
		}
		
		
	}

}
