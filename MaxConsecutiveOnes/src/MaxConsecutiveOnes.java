/*
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * 
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * 
 */

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int index = 0;
    	int maxConsecutive = 0;
    	int consecutive = 0;
    	
    	while (index < nums.length) {
    		if (nums[index] == 1) {
    			consecutive++;
    		}
    		else {
    			consecutive = 0;
    		}
    		if (maxConsecutive < consecutive) {
    			maxConsecutive = consecutive;
    		}
    		index++;
    	}
    
    	return maxConsecutive;
    }

}
