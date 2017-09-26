/*
 * Given a binary tree, find the leftmost value of the tree.
 * 
 */
public class BottomLeftTree {
	private int distanceLeft = 0;
	private int bottomLeftVal;
	
    public int findBottomLeftValue(TreeNode root) {
        int result = 0;
        
        bottomLeftVal = root.val;
        
        traverseTree(root, false, 0);
        
        result = bottomLeftVal;
        
        return result;
    }
    
    private void traverseTree(TreeNode node, boolean isLeft, int distance) {
    	if (node == null) {
    		return;
    	}
    	
    	if (isLeft == true) {
    		if (distance > distanceLeft) {
    			bottomLeftVal = node.val;
    			distanceLeft = distance;
    		}
    	}
    	
    	traverseTree(node.left, true, distance + 1);
    	traverseTree(node.right, false, distance + 1);
    }

}
