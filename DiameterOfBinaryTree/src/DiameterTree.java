/*
 * Given a binary tree, you need to compute the length of the diameter of the tree. 
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
 * This path may or may not pass through the root.
 * 
 */
public class DiameterTree {
	private int maxLength = 0;
	private int diameter = 0;
//	int maxLengthLeft = 0;
//	int maxLengthRight = 0;
    public int diameterOfBinaryTree(TreeNode root) {
//    	int result = 0;
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	findDiameter(root);
    	
//    	result = maxLengthLeft + maxLengthRight;
    	
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
    	
//    	int length = findLength(node.left) + findLength(node.right);
    	
    	if (length > diameter) {
    		diameter = length;
    	}
    	System.out.println("Diameter " + this.diameter + " Length " + length + " Node " + node.val);
    	
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
    
//    public int findLength(TreeNode node) {
//    	int length = 0;
//    	
//    	if (node == null) {
//    		return 0;
//    	}
//    	
//    	if (node.left != null) {
//    		this.maxLength = 0;
//    		traverseTree(node.left, 1);
//    		length += this.maxLength;
//    	}
//    	
//    	if (node.right != null) {
//    		this.maxLength = 0;
//    		traverseTree(node.right, 1);
//    		length += this.maxLength;
//    	}
//    	
//    	return length;
//    }
    
    public void printMaxLength() {
    	System.out.println(maxLength);
    }
}
