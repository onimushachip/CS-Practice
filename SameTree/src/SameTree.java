/* Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * 
 */
public class SameTree {
	private boolean result = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        compareTree(p, q);
        
        return result;
    }
    
    private void compareTree(TreeNode tree1, TreeNode tree2) {
    	if ((tree1 != null && tree2 == null) || (tree1 == null && tree2 != null)) {
    		result = false;
    		return;
    	}
    	
    	if (tree1 == null && tree2 == null) {
    		return;
    	}
    	
    	if (tree1.val != tree2.val) {
    		result = false;
    		return;
    	}
    	
    	compareTree(tree1.left, tree2.left);
    	compareTree(tree1.right, tree2.right);
    }

}
