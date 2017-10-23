import java.util.ArrayList;

/*
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 * 
 */
public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if (root == null) {
        	return result;
        }
        
        traverse(result, root);
        
    	return result;
    }
    
    private void traverse(ArrayList<Integer> list, TreeNode node) {
    	if (node == null) { 		
    		return;
    	}
    	
    	traverse(list, node.left);
    	
    	list.add(node.val);
    	
    	traverse(list, node.right);
    }
}
