import java.util.HashMap;

/* Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", 
 * t = "nagaram", return true.
 * s = "rat", 
 * t = "car", return false.
 * 
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	HashMap<Integer, Integer> LetterOccurrence = new HashMap<Integer, Integer>();
    	
    	if (s.length() != t.length()) {
    		return false;
    	}
    	
    	for (int i = 0; i < t.length(); i++) {
    		int charKey = t.codePointAt(i);
    		if (!LetterOccurrence.containsKey(charKey)) {
    			LetterOccurrence.put(charKey, 1);
    		}
    		else {
    			LetterOccurrence.put(charKey, LetterOccurrence.get(charKey) + 1);
    		}
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		int charKey = s.codePointAt(i);
    		if (LetterOccurrence.containsKey(charKey)) {
    			LetterOccurrence.put(charKey, LetterOccurrence.get(charKey) - 1);
    			if (LetterOccurrence.get(charKey) < 0) {
    				return false;
    			}
    		}
    		else {
    			return false;
    		}
    	}
        
    	return true;
    }

}
