
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
