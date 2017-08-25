import java.util.LinkedList;
import java.util.Queue;

/*
 * Invert a binary tree
 * 
 */
public class InvertBinary {
    public TreeNode invertTree(TreeNode root) {
    	Queue<TreeNode> neighbor = new LinkedList<TreeNode>();
    	
    	if (root == null) {
    		return null;
    	}
    	
    	neighbor.add(root);
    	
    	while (!neighbor.isEmpty()) {
    		
    		for (int i = 0; i < neighbor.size(); i++) {
    			TreeNode temp;
    			temp = neighbor.peek().left;
    			neighbor.peek().left = neighbor.peek().right;
    			neighbor.peek().right = temp;
    			if (neighbor.peek().left != null) {
    				neighbor.add(neighbor.peek().left);
    			}
    			if (neighbor.peek().right != null) {
    				neighbor.add(neighbor.peek().right);
    			}
    			neighbor.poll();
    		}
    	}
        
    	return root;
    }

}
