import java.util.Arrays;
import java.util.HashMap;

/* Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
 * The root is the maximum number in the array.
 * The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 * Construct the maximum tree by the given array and output the root node of this tree.
 * 
 */
public class MaximumBinaryTree {
	private HashMap<Integer, Integer> indexList = new HashMap<Integer, Integer>();
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    	TreeNode result = null;
        
    	for (int i = 0; i < nums.length; i++) {
    		indexList.put(nums[i], i);
    	}
    	
    	return result;
    }
    
    private void contructTree(TreeNode root, int[] valList) {
    	int maxVal = findMaxVal(valList);
    	int maxIndex = indexList.get(maxVal);
//    	int leftTail = maxIndex--;
//    	int rightHead = maxIndex++;
    	int[] valListLeft = Arrays.copyOfRange(valList, 0, maxIndex);
    	int[] valListRight = Arrays.copyOfRange(valList, maxVal, valList.length - 1);
    	
//    	if (leftTail == 0) {
//    		
//    	}
//    	else {
//    		
//    	}
//    	
//    	if (rightHead == valList.length - 1) {
//    		
//    	}
//    	else {
//    		
//    	}
    	
    }
    
    private int findMaxVal(int[] nums) {
    	Arrays.sort(nums);
    	
    	return nums[nums.length - 1];
    }
}
