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
	private int[] inputArray;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    	TreeNode result = null;
    	this.inputArray = Arrays.copyOf(nums, nums.length);
        
    	for (int i = 0; i < nums.length; i++) {
    		indexList.put(nums[i], i);
    	}
    	
    	return result;
    }
    
    public void constructTree(TreeNode root, int[] valList) {
    	if (valList.length == 0) {
    		
    		return;
    	}
    	
    	int head = indexList.get(valList[0]);
    	int tail = indexList.get(valList[valList.length - 1]);
    	int maxVal = findMaxVal(valList);
    	int maxIndex = indexList.get(maxVal);
    	
    	System.out.println(Arrays.toString(valList));
//    	int leftTail = maxIndex--;
//    	int rightHead = maxIndex++;
//    	int[] valListLeft;
//    	int[] valListRight;
    	
    	int[] valListLeft = Arrays.copyOfRange(inputArray, head, maxIndex);
    	int[] valListRight = Arrays.copyOfRange(inputArray, maxIndex + 1, tail + 1);
    	
//    	if (maxIndex + 1 > valList.length - 1) {
//    		valListRight = new int[0];
//    	}
//    	else {
//    		valListRight = Arrays.copyOfRange(inputArray, maxIndex + 1, tail + 1);
//    	}
//    	
//    	if (maxIndex == 1 && valList.length == 1) {
//    		valListLeft = new int[0];
//    	}
//    	else {
//    		valListLeft = Arrays.copyOfRange(inputArray, head, maxIndex);
//    	}
    	
    	System.out.println(maxVal + " Index " + maxIndex + " Left: " + Arrays.toString(valListLeft) + " Right: " + Arrays.toString(valListRight));
    	
    	constructTree(root, valListLeft);
    	constructTree(root, valListRight);
    	
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
    	int[] input = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(input);
    	
    	return input[input.length - 1];
    }
}
