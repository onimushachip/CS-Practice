import java.util.HashSet;
import java.util.Set;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * 
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
    	Set<Integer> apprearedChar = new HashSet<Integer>();
    	Set<Integer> repeatedChar = new HashSet<Integer>();
    	
    	if (s.length() == 1) {
    		return 0;
    	}
       	
    	for (int i = 0; i < s.length(); i++) {
    		if (!apprearedChar.contains(s.codePointAt(i))) {
    			apprearedChar.add(s.codePointAt(i));
    		}
    		else {
    			repeatedChar.add(s.codePointAt(i));
    		}
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		System.out.println(s.codePointAt(i));
    		if (!repeatedChar.contains(s.codePointAt(i))) {
    			return i;
    		}
    	}
    	
    	return -1;
    }

}
