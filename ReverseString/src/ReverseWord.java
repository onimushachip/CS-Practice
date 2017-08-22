import java.util.Stack;


/* Given a string, 
 * you need to reverse the order of characters in each word within a sentence 
 * while still preserving whitespace and initial word order.
 * 
 */

public class ReverseWord {
	
	public String reverseWords(String s) {
		String result = "";
		char[] resultArray = new char[s.length()];
		char[] charArray = s.toCharArray();
		int index = 0;
		int index2 = 0;
		int index3 = 0;
		int resultArrayIndex = 0;
		while (index < charArray.length) {
			if (charArray[index] == ' ') {
				index3 = index - 1;
				while (index3 >= index2) {
					resultArray[resultArrayIndex] = charArray[index3];
					index3--;
					resultArrayIndex++;
				}
				index2 = index + 1;
				resultArrayIndex++;
				resultArray[index] = ' ';
			}
			//Get the last word
			if (index == charArray.length - 1) {
				index3 = index;
				while (index3 >= index2) {
					resultArray[resultArrayIndex] = charArray[index3];
					index3--;
					resultArrayIndex++;
				}
			}
			
			index++;
		}
		
		result = new String(resultArray);
		
		return result;
	}
	
    public String reverseWordsStack(String s) {
        String result = "";
        Stack<String> reversedWord = new Stack<>();
        int index = 0;
        while (index < s.length()) {	
        	if (s.charAt(index) == ' ') {
        		while (!reversedWord.isEmpty()) {
        			result += reversedWord.pop();
        		}
        		result += " ";
        	}
        	else {
        		reversedWord.push("" + s.charAt(index));
        	}
        	
	        /*
	       	 * last word since
	       	 * there's nothing following it
	       	 */
	       	if (index == s.length() - 1) {
	       		while (!reversedWord.isEmpty()) {
	       			result += reversedWord.pop();
	       		}
	       	}
        	index++;
        }
        return result;
    }

}
