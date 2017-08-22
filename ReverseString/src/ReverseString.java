
public class ReverseString {
    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        char[] resultArray = new char[s.length()];
        int indexResult = 0;
        int indexInput = s.length() - 1;
        while (indexInput >= 0) {
        	resultArray[indexResult] = charArray[indexInput];
        	indexInput--;
        	indexResult++;
        }
        
    	return new String(resultArray);
    }
}
