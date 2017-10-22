import java.util.ArrayList;
import java.util.HashMap;

/*
 * Given a non-empty array of integers, return the k most frequent elements.
 * For example,
 * Given [1,1,1,2,2,3] and k = 2, return [1,2].
 * 
 */
public class TopFrequentElement {
    public ArrayList<Integer> topKFrequent(int[] nums, int k) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	HashMap<Integer, Integer> occurrenceMap = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < k; i++) {
    		result.add(null);
    	}
    	
    	occurrenceMap.put(null, 0);
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (occurrenceMap.containsKey(nums[i])) {
    			occurrenceMap.put(nums[i], occurrenceMap.get(nums[i]) + 1);
    		}
    		else {
    			occurrenceMap.put(nums[i], 1);
    		}
    		
    		for (int j = 0; j < result.size(); j++) {
    			int occurrence = occurrenceMap.get(nums[i]);
    			
    			if (occurrence >= occurrenceMap.get(result.get(j))) {
    				if (occurrence == occurrenceMap.get(result.get(j)) && j < result.size() - 1) {
    					if (result.get(j + 1) == null) {
    						if (nums[i] == result.get(j)) {
    							break;
    						}
    						
    						result.remove(j + 1);
    						
    						result.add(j + 1, nums[i]);
    						
    						break;
    					}
    				}
    				else {
        				result.remove(j);
        				
        				result.add(j, nums[i]);
        				
        				break;
    					
    				}
    			}
    		}
    	}
    	
    	return result;
    }

}
