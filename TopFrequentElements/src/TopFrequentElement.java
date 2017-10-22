import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

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
    	ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1]; 
    	
//    	for (int i = 0; i < k; i++) {
//    		result.add(null);
//    	}
    	if (nums.length == 1) {
    		result.add(nums[0]);
    		
    		return result;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (occurrenceMap.containsKey(nums[i])) {
    			occurrenceMap.put(nums[i], occurrenceMap.get(nums[i]) + 1);
    		}
    		else {
    			occurrenceMap.put(nums[i], 1);
    		}
    	}
    	
    	for (Integer number : occurrenceMap.keySet()) {
    		int bucketKey = occurrenceMap.get(number);
    		
    		if (bucket[bucketKey] != null) {
    			bucket[bucketKey].add(number);
    		}
    		else {
    			bucket[bucketKey] = new ArrayList<Integer>();
    			
    			bucket[bucketKey].add(number);
    		}
    	}
    	
    	for (int i = bucket.length - 1; i >= 0; i--) {
    		if (bucket[i] != null) {
    			for (int j = 0; j < bucket[i].size(); j++) {
    				if (result.size() == k) {
    					break;
    				}
    				result.add(bucket[i].get(j));
    			}
    		}
    	}
    	
    	return result;
    }

}
