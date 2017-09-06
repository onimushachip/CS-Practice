/*
 * Find the sum of all left leaves in a given binary tree.
 * 
 */
public class SumLeftLeave {
	private int result = 0;
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
        
    	addAllLeftLeaf(root);
    	
    	return result;
    }
    
    private void addAllLeftLeaf(TreeNode root) {
    	if (root.left != null) {
    		if (root.left.left == null && root.left.right == null) {
    			this.result += root.left.val;
    		}
    		addAllLeftLeaf(root.left);
    	}
    	
    	if (root.right != null) {
    		addAllLeftLeaf(root.right);
    	}
    }

}
