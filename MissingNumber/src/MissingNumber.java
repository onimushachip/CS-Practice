import java.util.Arrays;

/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * 
 */
public class MissingNumber {
    public int missingNumberBinarySearch(int[] nums) {
        int result = 0;
        int left = 0;
        int right = nums.length;
        int mid = (left + right) / 2;
        
        Arrays.sort(nums);
        
        while (left < right) {
//        	System.out.println("check");
        	mid = (left + right) / 2;
        	
        	if (nums[mid] > mid) { //Missing number is in the left
        		right = mid;
        	}
        	else { //Missing number is in the right
        		left = mid + 1;  //Exit the loop
        	}
        }
        
        result = left;
    	
        return result;
    }
    
    public int missingNumberLinear(int[] nums) { 	
    	Arrays.sort(nums);
    	
//    	if (nums.length == 1) {
//    		if (nums[0] == 1) {
//    			return 0;
//    		}
//    		else {
//    			return 1;
//    		}
//    	}
    	
    	for (int i = 0; i < nums.length - 1; i++) {
    		if ((nums[i + 1] - nums[i]) != 1) {
    			return nums[i] + 1;
    		}
    	}
    	
    	if (nums[nums.length - 1] == nums.length) {
    		return 0;
    	}
    	else {
    		return nums.length;
    	}
    }
}
