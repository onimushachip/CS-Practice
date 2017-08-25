/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * 
 */
public class MaximumDepthBinaryTree {
	int maxDepth = 0;
    public int maxDepth(TreeNode root) {
    	if (root != null) {
    		traverseTree(root, 0); //Set the start level, 0 means the start lv is 1
    	}
    	
        return maxDepth;
    }
    
    public void traverseTree(TreeNode root, int level) {
    	level++;
//    	System.out.println(root.val);
    	if (root.left != null) {
    		traverseTree(root.left, level);
    	}
    	if (root.right != null) {
    		traverseTree(root.right, level);
    	}
    	else {
    		if (maxDepth < level) {
    			maxDepth = level;
    		}
    	}
    }
}
