import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 * 
 */
public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
    	Set<Integer> appearedNumbers = new HashSet<Integer>();
    	
    	if (nums.length == 1) {
    		return false;
    	}
    	
    	if (nums == null || nums.length == 0) {
    		return false;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (appearedNumbers.contains(nums[i])) {
    			return true;
    		}
    		else {
    			appearedNumbers.add(nums[i]);
    		}
    	}
    	
        return false;
    }

}
