package string_stringbuilder;

public class QuerSumme {

	
	public static int SumOfdigit(int value) {
		int sum = 0;
		while(value != 0) {
			sum = sum + (value %10);
			value = value /10;
					
		}return sum;
	}
	 public static int digitSum(String value) {
	        int sum = 0;
	        for (int i = 0; i < value.length(); i++) {
	            sum = sum + Integer.parseInt(value); 
	        }
	        return sum;	
	    }
	
	
	
	
	public static void main(String[] args) {
		int number = 1245645;
		String numberString = "1245645";
		 int sum1 = QuerSumme.SumOfdigit(number);
		 int sum2 = QuerSumme.digitSum(numberString);
		 System.out.println(sum1);
		 System.out.println(sum2);

	}

}
