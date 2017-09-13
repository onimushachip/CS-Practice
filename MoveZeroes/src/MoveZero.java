import java.util.Arrays;

/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * 
 */


public class MoveZero {
    public void moveZeroes(int[] nums) {
        int zeroSlot = nums.length - 1;
        int zeroFinder = 0;
        
        for (int i = nums.length - 1; i >= 0; i--) {
        	if (nums[i] == 0) {
        		zeroFinder = i;
        		while (zeroFinder != zeroSlot) {
        			if (nums[zeroFinder + 1] != 0) {
        				//swap
        				nums[zeroFinder] = nums[zeroFinder + 1];
        				nums[zeroFinder + 1] = 0;
        			}
        			zeroFinder++;
        		}
        		zeroSlot--;
        	}
        }
    }
	
	
	//Copy the input array
    public void moveZeroesCopy(int[] nums) {
    	int[] result = new int[nums.length];
    	int resultIndexTail = result.length - 1;
    	int resultIndexHead = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != 0) {
    			result[resultIndexHead] = nums[i];
    			resultIndexHead++;
    		}
    		else {
    			result[resultIndexTail] = nums[i];
    			resultIndexTail--;
    		}
    	}
    	
        nums = result;
    }

}
