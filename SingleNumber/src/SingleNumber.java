import java.util.Arrays;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	int index = 0;
    	
//    	System.out.println(Arrays.toString(nums));
    	
    	while (index < nums.length - 1) {
    		if (nums[index] != nums[index + 1]) {
    			return nums[index];
    		}
    		
    		index += 2;
    	}
    	
        return nums[nums.length - 1];
    }
}
