/*
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to 
 * the original key plus sum of all keys greater than the original key in BST.
 * 
 */


public class ConvertBST {
	private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
    	convertTree(root);
        
    	return root;
    }
    
    private void convertTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	convertTree(root.right);
    	sum += root.val;
    	root.val = sum;
    	convertTree(root.left);
    }
    
    public void traverseTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	System.out.println(root.val);
    	traverseTree(root.left);
    	traverseTree(root.right);
    }

}
