package Stack;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Calculator {

    	public static int calculateUPN(String input) {
    		LinkedList<Integer> stack = new LinkedList<>();
    		//Pattern für mathematische Grundrechenarten
    		Pattern operatorPattern = Pattern.compile("[+*/-]");
    		//Pattern für ganze Zahle: \\d ... Ziffer [0:9]
    		//							+  ... beliebig viele
    		Pattern nummericPattern = Pattern.compile("\\d+");
    		
    		for(String token : input.split("\\s+")) {
    			Matcher operatorMatcher = operatorPattern.matcher(token);
    			Matcher numericMatcher = nummericPattern.matcher(token);
    			if(numericMatcher.matches()) {
    				stack.push(Integer.parseInt(token));
    			}else if(operatorMatcher.matches()) {
    				int operand1 = stack.pop();
    				int operand2 = stack.pop();
    				int result = 0;
    				switch(token) {
    				case "+": result = operand1 + operand2; break;
    				case "-": result = operand1 - operand2; break;
    				case "*": result = operand1 * operand2; break;
    				case "/": result = operand1 / operand2; break;
    				default: System.out.println("Ungültige Operation");
    				}
    				stack.push(result);
    			}
    		}
    			return stack.pop();
    		
    	}
    	
	    public static void main(String[] args) {
	    	String str = "12 34 23 + *";
	    	System.out.println(calculateUPN(str));
	    	
	    }
}
