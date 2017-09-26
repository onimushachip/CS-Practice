import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree, find the leftmost value in the last row of the tree.
 * 
 */

public class BottomLeftLastRow {
    public int findBottomLeftValue(TreeNode root) {
    	int result = 0;
    	Queue<TreeNode> treeLevel = new LinkedList<TreeNode>();
    	
    	treeLevel.add(root);
    	
    	while (treeLevel.isEmpty() == false) {
    		int levelSize = treeLevel.size();
    		
    		for (int i = 0; i < levelSize; i++) {
    			if (i == 0) {
    				result = treeLevel.peek().val;
    			}
    			
    			if (treeLevel.peek().left != null) {
    				treeLevel.add(treeLevel.peek().left);
    			}
    			
    			if (treeLevel.peek().right != null) {
    				treeLevel.add(treeLevel.peek().right);
    			}
    			
    			treeLevel.poll();
    		}
    	}
    	
        return result;
    }

}
