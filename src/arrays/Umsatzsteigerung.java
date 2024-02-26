package arrays;

public class Umsatzsteigerung {
static int[] dailyGains = {1000, 2000, 500, 9000, 9010};
	
	static int count5PercentJumps(int[] gains) {
		int count = 0;
		if(gains != null) {
			
	    for (int i = 1; i < gains.length-1; i++) {
	    	 	if(gains[i]*1.05>=gains[i+1]) { 
	    	 	count++;
	    	 		      
	    	 	         }
	         }
		
		
		
		}return count;
	}
		
public static void main(String []args) {
	   System.out.println(count5PercentJumps(dailyGains));
}
	}


