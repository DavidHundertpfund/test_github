package Stack;
import java.util.Stack;
	public class Wörterumdrehen {
	

	    public static String reverseString(String input) {
	        Stack<Character> stack = new Stack<>();

	  
	        for (int i = 0; i < input.length(); i++) {
	     	            stack.push(input.charAt(i));
	        }

	        StringBuilder reversed = new StringBuilder();
	       
	        while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }    
	        return reversed.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Hello World";
	        String reversed = reverseString(input);
	        System.out.println("Original: " + input);
	        System.out.println("Reversed: " + reversed);
	    
	}
	

	
	}
