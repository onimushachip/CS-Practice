import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines; 
 * otherwise, it will return false.Each letter in the magazine string can only be used once in your ransom note.
 * 
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
    	Map<Integer, Integer> magazineCapacity = new HashMap<Integer, Integer>();
    	
    	if (ransomNote == null || magazine == null) {
    		return false;
    	}
    	
    	//Put every char with its occurrence in the magazine in a hashmap  
    	for (int i = 0; i < magazine.length(); i++) {
			int charKey = magazine.codePointAt(i);
    		if (magazineCapacity.containsKey(magazine.codePointAt(i))) {
    			magazineCapacity.put(charKey, magazineCapacity.get(charKey) + 1);
    		}
    		else {
    			magazineCapacity.put(charKey, 1);
    		}
    	}
    	
    	System.out.println(Arrays.asList(magazineCapacity));
    	
    	//Check every char in the ransom note
    	for (int i = 0; i < ransomNote.length(); i++) {
    		int charKey = ransomNote.codePointAt(i);
    		if (magazineCapacity.containsKey(charKey)) {
    			magazineCapacity.put(charKey, magazineCapacity.get(charKey) - 1);
    			if (magazineCapacity.get(charKey) < 0) {
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
