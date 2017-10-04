import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
 * Find the two elements that appear only once.
 * For example:
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * 
 */

public class SingleNumberVariation {
    public int[] singleNumber(int[] nums) {
        int[] result = null;
        Set<Integer> occurrence = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	if (occurrence.contains(nums[i])) {
        		occurrence.remove(nums[i]);
        	}
        	else {
        		occurrence.add(nums[i]);
        	}
        }
        
        result = new int[occurrence.size()];
        
        int resultIndex = 0; 
        
        for (Integer number : occurrence) {
        	result[resultIndex] = number;
        	resultIndex++;
        }
        
    	return result;
    }
}
