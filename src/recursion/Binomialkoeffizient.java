package recursion;

public class Binomialkoeffizient {
			
	public static int calculateBinomialkoeffizient(int a, int k) {
		if(k==0 || k==a) {
			return 1;
		}else {
			return calculateBinomialkoeffizient(a-1,k-1) + calculateBinomialkoeffizient(a-1,k);
		}
	}
	
	public static void main(String[] args) {

	}

}
