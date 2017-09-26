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
    	
    	result = constructTree(result, nums);
    	
    	return result;
    }
    
    public TreeNode constructTree(TreeNode root, int[] valList) {
    	if (valList.length == 0) {
    		
    		return null;
    	}
    	
    	int head = indexList.get(valList[0]);
    	int tail = indexList.get(valList[valList.length - 1]);
    	int maxVal = findMaxVal(valList);
    	int maxIndex = indexList.get(maxVal);
    	
    	TreeNode resultNode = new TreeNode(maxVal);
    	
    	root = resultNode;
    	
    	System.out.println(Arrays.toString(valList) + " Node value " + root.val);
    	
    	int[] valListLeft = Arrays.copyOfRange(inputArray, head, maxIndex);
    	int[] valListRight = Arrays.copyOfRange(inputArray, maxIndex + 1, tail + 1);
    	
    	System.out.println(maxVal + " Index " + maxIndex + " Left: " + Arrays.toString(valListLeft) + " Right: " + Arrays.toString(valListRight));
    	
    	root.left = constructTree(root.left, valListLeft);
    	root.right = constructTree(root.right, valListRight);
    	
    	return resultNode;
    }
    
    private int findMaxVal(int[] nums) {
    	int[] input = Arrays.copyOf(nums, nums.length);
    	Arrays.sort(input);
    	
    	return input[input.length - 1];
    }
}
