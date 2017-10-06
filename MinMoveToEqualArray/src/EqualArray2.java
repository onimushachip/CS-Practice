import java.util.Arrays;

/*
 * Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, 
 * where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
 * You may assume the array's length is at most 10,000.
 * 
 */
public class EqualArray2 {
    public int minMoves2(int[] nums) {
    	if (nums.length == 0 || nums.length == 1) {
    		return 0;
    	}
    	
        int moveSum = 0;
        
        Arrays.sort(nums);
        
        int pivot = nums[(nums.length - 1) / 2];
        
        for (int i = 0; i < nums.length; i++) {
        	int difference = Math.abs(nums[i] - pivot);
        	
        	moveSum += difference;
        }
        
        return moveSum;
    }

}
