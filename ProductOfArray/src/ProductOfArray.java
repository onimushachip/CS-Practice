
/*
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 */

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return new int[0];
    	}
    	
    	int[] result = new int[nums.length];
    	int leftToRightProduct = 1;
    	
    	for (int i = 0; i < nums.length; i++) {
    		result[i] = leftToRightProduct;
    		
    		leftToRightProduct *= nums[i];
    	}
    	
    	int rightToLeftProduct = 1;
    	
    	for (int i = nums.length - 1; i >= 0; i-- ) {
    		result[i] = result[i] * rightToLeftProduct;
    		
    		rightToLeftProduct *= nums[i];
    	}
    	
        return result;
    }
	
	
    public int[] productExceptSelfBruteForce(int[] nums) {
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		int singleProduct = 1;
    		
    		for (int j = 0; j < nums.length; j++) {
    			if (j != i) {
    				singleProduct = singleProduct * nums[j];
    			}
    		}
    		
    		result[i] = singleProduct;
    	}
    	
        return result;
    }
}
