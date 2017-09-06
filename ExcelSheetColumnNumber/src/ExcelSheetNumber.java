/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * 
 */

public class ExcelSheetNumber {
    public int titleToNumber(String s) {
    	int result = 0;
    	
    	if (s.length() == 1) {
    		result += s.codePointAt(0) - 64;
    		return result;
    	}	
    	
    	for (int i = s.length() - 2; i >=0; i--) {
    		int power = (int)Math.pow(26, s.length() - 1 - i);
    		result += power * (s.codePointAt(i) - 64);
//    		System.out.println(power + " digit: " + (s.length() - 1 - i) + " char: " + s.charAt(i)
//    				+ " value: " + (s.codePointAt(i) - 64));
//    		System.out.println(s.length() - 1 - i);
    	}
//    	Unit number char
    	result += s.codePointAt(s.length() - 1) - 64;
    	
    	return result;
    }
}
