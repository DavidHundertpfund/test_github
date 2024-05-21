package exceptions;

import java.util.Arrays;

public class StringArrayParser {
	
	private static int parseStringToInt(String string, int defaultValue) {
		try {
			return Integer.parseInt(string);
		} catch(NumberFormatException e) {
			return defaultValue;
		}
	}
	
	
	public static int[] parseInts(String... numbers) {
		int[] intNumbers = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			intNumbers[i] = parseStringToInt(numbers[i],0);
		}
		return   intNumbers;
		
	}

	
	public static void main(String[] args) {
		int[] test1 = parseInts("2", "34", "456");
		System.out.println(Arrays.toString(test1));
		int[] test2 = parseInts("2", "hallo");
		System.out.println(Arrays.toString(test2));
		
	
	}
	
}
