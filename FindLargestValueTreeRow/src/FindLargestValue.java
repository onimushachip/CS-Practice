import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * You need to find the largest value in each row of a binary tree.
 * 
 */
public class FindLargestValue {
	private List<Integer> resultList = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
    	if (root == null) {
    		return resultList;
    	}
    	
    	Queue<TreeNode> treeLevel = new LinkedList<TreeNode>();
    	int maxValue = Integer.MIN_VALUE;
    	
    	treeLevel.add(root);
    	
    	while (!treeLevel.isEmpty()) {
    		maxValue = Integer.MIN_VALUE;
    				
    		int numberOfNodes = treeLevel.size();
    				
    		for (int i = 0; i < numberOfNodes; i++) {
    			if (treeLevel.peek().val > maxValue) {
    				maxValue = treeLevel.peek().val;
    			}
    			
    			if (treeLevel.peek().left != null) {
    				treeLevel.add(treeLevel.peek().left);
    			}
    			
    			if (treeLevel.peek().right != null) {
    				treeLevel.add(treeLevel.peek().right);
    			}
    			
    			treeLevel.poll();
    		}
    		
    		resultList.add(maxValue);
    	}
     
    	return resultList;
    }

}
