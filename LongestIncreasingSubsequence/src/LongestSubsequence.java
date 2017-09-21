/*
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence.
 * 
 */
public class LongestSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int sequenceLength = 1;
        boolean sequence = true;
        
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        
        if (nums.length == 1) {
        	return 1;
        }
        
        for (int i = 1; i < nums.length; i++) {
        	System.out.println(sequence + " " + nums[i]);
        	if (nums[i] > nums[i - 1]) {
        		sequence = true;
        	}
        	else {
        		sequence = false;
        		sequenceLength = 1;
        	}
    		if (sequence == true) {
    			sequenceLength++;
    			if (maxLength < sequenceLength) {
    				maxLength = sequenceLength;
    			}
    		}
        }
    	
    	return maxLength;
    }

}
