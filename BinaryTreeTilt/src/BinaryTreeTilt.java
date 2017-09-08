/* Given a binary tree, return the tilt of the whole tree.
 * The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. 
 * Null node has tilt 0.
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * 
 */
public class BinaryTreeTilt {
	private int result = 0;
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        traverseTree(root);
        
        return result;
    }
    
    public int traverseTree(TreeNode tree) {
    	int leftValue;
    	int rightValue;
    	
    	if (tree == null) {
    		return 0;
    	}

    	leftValue = traverseTree(tree.left);
    	rightValue = traverseTree(tree.right);
    	
    	result += Math.abs(leftValue - rightValue);
    	
    	return leftValue + rightValue + tree.val;
    }

}
