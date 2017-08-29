/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * 
 */


public class DigitalRoot {
	
    public int addDigits(int num) {
    	int result = 0;
    	String digit = Integer.toString(num);
    	
    	while (digit.length() > 1) {
    		int sumDigit = 0;
    		for (int i = 0; i < digit.length(); i++) {
    			sumDigit += Integer.parseInt(digit.charAt(i) + "");
    		}
    		digit = Integer.toString(sumDigit);
    		System.out.println(digit);
    	}
    	result = Integer.parseInt(digit);
    	
    	
    	
    	return result;
    }
}
