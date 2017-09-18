import java.util.Arrays;

/*
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * 
 */
public class MaxProduct {
    public int maximumProduct(int[] nums) {
        int result = 0;
        
        if (nums.length <= 3) {
        	result = 1;
        	for (int i = 0; i < nums.length; i++) {
        		result = result * nums[i];
        	}
        	return result;
        }
        
        Arrays.sort(nums);
        
        result = 1;
        
        if (nums[0] < 0 && nums[1] < 0) {
        	result = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        	if (result < nums[nums.length - 1] * nums[0] * nums[1]) {
        		result = nums[nums.length - 1] * nums[0] * nums[1];
        	}
        }
        else {
        	result = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }
    	
    	return result;
    }
}
