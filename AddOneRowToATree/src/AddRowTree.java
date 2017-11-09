import java.util.LinkedList;
import java.util.Queue;

/*
 * Given the root of a binary tree, then value v and depth d, 
 * you need to add a row of nodes with value v at the given depth d. The root node is at depth 1.The adding rule is: given a positive integer depth d, 
 * for each NOT null tree nodes N in depth d-1, 
 * create two tree nodes with value v as N's left subtree root and right subtree root. 
 * And N's original left subtree should be the left subtree of the new left subtree root, 
 * its original right subtree should be the right subtree of the new right subtree root. 
 * If depth d is 1 that means there is no depth d-1 at all, 
 * then create a tree node with value v as the new root of the whole original tree, and the original tree is the new root's left subtree.
 * 
 */
public class AddRowTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
    	if (d == 1) {
    		TreeNode newRoot = new TreeNode(v);
    		
    		newRoot.left = root;
    		
    		return newRoot;
    	}
    	
    	Queue<TreeNode> targetLevelNodes = new LinkedList<TreeNode>();
    	Queue<TreeNode> prevLevelNodes = new LinkedList<TreeNode>();
    	int targetValue = v;
    	int currentLevel = 1;
    	
    	targetLevelNodes.add(root);
    	
    	while (currentLevel < d) {
    		int currentLevelSize = targetLevelNodes.size();
    		
    		prevLevelNodes.clear();
    		
    		for (int i = 0; i < currentLevelSize; i++) {
    			if (targetLevelNodes.peek().left != null) {
    				targetLevelNodes.add(targetLevelNodes.peek().left);
    			}
    			
    			if (targetLevelNodes.peek().right != null) {
    				targetLevelNodes.add(targetLevelNodes.peek().right);
    			}
    			
    			prevLevelNodes.add(targetLevelNodes.poll());
    		}
    		
    		currentLevel++;
    	}
    	
    	while (!prevLevelNodes.isEmpty()) {
    		if (prevLevelNodes.peek().left != null) {
    			prevLevelNodes.peek().left = new TreeNode(targetValue);
    			
    			prevLevelNodes.peek().left.left = targetLevelNodes.poll();
    		}
    		else {
    			prevLevelNodes.peek().left = new TreeNode(targetValue);
    		}
    		
    		if (prevLevelNodes.peek().right != null) {
    			prevLevelNodes.peek().right = new TreeNode(targetValue);
    			
    			prevLevelNodes.peek().right.right = targetLevelNodes.poll();
    		}
    		else {
    			prevLevelNodes.peek().right = new TreeNode(targetValue);
    		}
    		
    		prevLevelNodes.poll();
    	}
     
    	return root;
    }

}
