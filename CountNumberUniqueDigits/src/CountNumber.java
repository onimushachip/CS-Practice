import java.util.HashSet;
import java.util.Set;

/*
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 <= x < 10^n.
 * 
 * Example:
 * Given n = 2, return 91. (The answer should be the total numbers in the range of 0 <= x < 100, excluding [11,22,33,44,55,66,77,88,99])
 * 
 */
public class CountNumber {
	private Set<Character> tempSet = new HashSet<Character>();
	
    public int countNumbersWithUniqueDigits(int n) {
    	int limit = (int) Math.pow(10, n);
    	int result = limit;
    	
    	for (int i = 0; i < limit; i++) {
    		if (!checkUnique(i)) {
    			result--;
    		}
    	}
        
    	return result;
    }
    
    public int countNumberWithUniqueDigitsFast(int n) {
    	int limit = n;
    	int result = 1;
    	int resultStack = 0;
    	
    	if (n > 10) {
    		limit = 10;
    	}
    	
    	for (int i = 1; i <= limit; i++) {
    		if (i == 1) {
    			result = result * 10;
    			
    			resultStack += result;
    		}
    		else if (i == 2) {
    			result = 9 * 9;
    			
    			resultStack += result;
    		}
    		else {
    			result = result * (12 - i);
    			
    			resultStack += result;
    		}
    	}
    	
    	return resultStack;
    }
    
    private boolean checkUnique(int input) {
    	String inputString = Integer.toString(input);
    	
    	tempSet.clear();
    	
    	for (int i = 0; i < inputString.length(); i++) {
    		if (tempSet.contains(inputString.charAt(i))) {
    			return false;
    		}
    		
    		tempSet.add(inputString.charAt(i));
    	}
    	
    	return true;
    }
}
