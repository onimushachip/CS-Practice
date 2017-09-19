/*
 * Given an integer, return its base 7 string representation.
 * 
 */
public class ConvertToBase7 {
    public String convertToBase7(int num) {
    	if (num < 0) {
    		return "-" + convertToBase7(-num);
    	}
    	if (num < 7) {
    		return Integer.toString(num);
    	}
    	
    	String remainder = Integer.toString(num % 7);
    	
    	String result = convertToBase7(num / 7) + remainder;
    	
    	return result;
    }

}
