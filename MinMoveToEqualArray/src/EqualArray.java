import java.util.Arrays;

/*
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, 
 * where a move is incrementing n - 1 elements by 1.
 * 
 */

public class EqualArray {
	public int minMoves(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		Arrays.sort(nums);
		int steps = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			steps += nums[i] - nums[0];
		}
		return steps;
	}
	
	
	//Experimental method
    public int minMovesSum(int[] nums) {
    	int steps = 0;
    	int sum = 0;
    	int maxNumber = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (maxNumber < nums[i]) {
    			maxNumber = nums[i];
    		}
    		sum += nums[i];
    	}
    	
    	steps = sum % nums.length;
    	
    	if (steps == 0 && sum < maxNumber * nums.length) {
    		return nums.length;
    	}
    	else {
    		return steps; 
    	}     
    }
}
