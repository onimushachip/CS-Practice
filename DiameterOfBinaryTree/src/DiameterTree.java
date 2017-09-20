/*
 * Given a binary tree, you need to compute the length of the diameter of the tree. 
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
 * This path may or may not pass through the root.
 * 
 */
public class DiameterTree {
	private int maxLength = 0;
	private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	
    	findDiameter(root);
    	
        return diameter;
    }
    
    public void findDiameter(TreeNode node) {
    	if (node == null) {
    		return;
    	}
    	
    	int length = 0;
    	
    	if (node.left != null) {
    		this.maxLength = 0;
    		traverseTree(node.left, 1);
    		length += this.maxLength;
    	}
    	
    	if (node.right != null) {
    		this.maxLength = 0;
    		traverseTree(node.right, 1);
    		length += this.maxLength;
    	}
    	
    	if (length > diameter) {
    		diameter = length;
    	}
    	
    	findDiameter(node.left);
    	findDiameter(node.right);
    }
    
    public void traverseTree(TreeNode node, int length) {
    	if (node == null) {
    		return;
    	}
    	
    	traverseTree(node.left, length + 1);
    	traverseTree(node.right, length + 1);
    	
    	if (length > this.maxLength) {
    		this.maxLength = length;
    	}
    }
    
    public void printMaxLength() {
    	System.out.println(maxLength);
    }
}
