import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a string, sort it in decreasing order based on the frequency of characters.
 * 
 */

public class SortCharacter {
    public String frequencySort(String s) {
    	if (s.length() == 1 || s.length() == 0) {
    		return s;
    	}
    	
    	Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
    	char[] result = new char[s.length()];
    	List<Character>[] freqList = new List[s.length() + 1]; //Max freq can be the length of s
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (freqMap.containsKey(s.charAt(i))) {
    			char key = s.charAt(i);
    			
    			freqMap.put(key, freqMap.get(key) + 1);
    		}
    		else {
    			freqMap.put(s.charAt(i), 1);
    		}
    	}
    	
    	for (Character key : freqMap.keySet()) {
    		int frequency = freqMap.get(key);
    		
    		if (freqList[frequency] == null) {
    			freqList[frequency] = new ArrayList<Character>();
    			
    			freqList[frequency].add(key);
    		}
    		else {
    			freqList[frequency].add(key);
    		}
    	}
    	
    	int resultIndex = 0;
    	
    	for (int i = freqList.length - 1; i >= 0; i--) {
    		if (freqList[i] != null) {
    			for (int k = 0; k < freqList[i].size(); k++) {
//    				int destinationIndex = resultIndex + i;
//    				int startIndex = resultIndex;
    				
        			for (int j = 0; j < i; j++) {
        				result[resultIndex] = freqList[i].get(k);
//        				System.out.println(freqList[i].get(k));
        				resultIndex++;
        			}
        			
//        			resultIndex = destinationIndex + 1;
    			}
    		}
    	}
    	
        return new String(result);
    }
    
}
