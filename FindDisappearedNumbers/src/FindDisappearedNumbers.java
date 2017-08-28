import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of integers where 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * 
 */


public class FindDisappearedNumbers {
	private List<Integer> result = new ArrayList<Integer>();
	
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	Map<Integer, Integer> occurence = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		if (occurence.containsKey(nums[i])) {
    			int newOccurence = occurence.get(nums[i]) + 1;
    			occurence.put(nums[i], newOccurence);
    		}
    		else {
    			occurence.put(nums[i], 1);
    		}
    	}
    	

    	
    	for (int i = 1; i <= nums.length; i++) {
    		if (!occurence.containsKey(i)) {
    			result.add(i);
    		}
    	}
    	
//    	System.out.println(Arrays.asList(result));
        
    	return result;
    }
}
