import java.util.HashSet;
import java.util.Set;

/* 
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer, 
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 * 
 */
public class HappyNumber {
    public boolean isHappy(int n) {
    	Set<Integer> sumRecord = new HashSet<Integer>();
        int number = n;
        int sum = n;
    	
    	while (sum != 1) {
//    		System.out.println(sum);
    		number = sum;
    		
    		sum = 0;
    		
    		String digits = Integer.toString(number);
    		
    		for (int i = 0; i < digits.length(); i++) {
    			int digit = Integer.parseInt(digits.substring(i, i + 1));
    			
    			sum += digit * digit;
    		}	
    		
    		if (sumRecord.contains(sum)) {
    			return false;
    		}
    		
    		sumRecord.add(sum);
    	}
    	
    	return true;
    }
}
