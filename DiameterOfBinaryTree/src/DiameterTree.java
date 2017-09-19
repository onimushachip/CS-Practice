/*
 * Given a binary tree, you need to compute the length of the diameter of the tree. 
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
 * This path may or may not pass through the root.
 * 
 */
public class DiameterTree {
//	private int maxLength = 0;
	int maxLengthLeft = 0;
	int maxLengthRight = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    	int result = 0;
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	traverseTreeLeft(root.left, 0);
    	traverseTreeRight(root.right, 0);
    	
    	result = maxLengthLeft + maxLengthRight;
    	
        return result;
    }
    
    private void traverseTreeLeft (TreeNode node, int maxLength) {
    	if (node == null) {
    		return;
    	}
    	
    	maxLength++;
    	
    	if (maxLength > maxLengthLeft) {
    		maxLengthLeft = maxLength;
    	}
    	
    	traverseTreeLeft(node.left, maxLength);
    	traverseTreeLeft(node.right, maxLength);
    }
    
    private void traverseTreeRight (TreeNode node, int maxLength) {
    	if (node == null) {
    		return;
    	}
    	
    	maxLength++;
    	
    	if (maxLength > maxLengthRight) {
    		maxLengthRight = maxLength;
    	}
    	
    	traverseTreeRight(node.left, maxLength);
    	traverseTreeRight(node.right, maxLength);
    }
}
