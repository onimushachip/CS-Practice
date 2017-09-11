import java.util.HashMap;

/*	Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
    	int result = 0;
    	HashMap<Integer, Integer> elementOccurrence = new HashMap<Integer, Integer>();
    	int mode = (int)Math.floor(nums.length/2);
    	
    	if (nums.length == 1) {
    		return nums[0];
    	}
        
    	for (int i = 0; i < nums.length; i++) {
    		if (elementOccurrence.containsKey(nums[i])) {
    			int occurrence = elementOccurrence.get(nums[i]);
    			elementOccurrence.put(nums[i], occurrence + 1);
    			if (elementOccurrence.get(nums[i]) > mode) {
    				result = nums[i];
    				return result;
    			}
    		}
    		else {
    			elementOccurrence.put(nums[i], 1);
    		}
    	}
    	
    	return result;
    }

}
