import java.util.HashMap;

/*
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
    	int maxLength = 0;
    	HashMap<Integer, Integer> letterOccurrence = new HashMap<Integer, Integer>();
    	
    	if (s == null || s.length() == 0) {
    		return 0;
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		int charKey = s.codePointAt(i);
    		if (letterOccurrence.containsKey(charKey)) {
    			letterOccurrence.put(charKey, letterOccurrence.get(charKey) + 1);
    			if (letterOccurrence.get(charKey) % 2 == 0) {
    				maxLength += 2;
    			}
    		}
    		else {
    			letterOccurrence.put(charKey, 1);
    		}
    	}
    	
    	if (maxLength < s.length()) {
    		maxLength += 1;
    	}
    	
        return maxLength;
    }

}
