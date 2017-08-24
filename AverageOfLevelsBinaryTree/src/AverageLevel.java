import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * 
 */


public class AverageLevel {
	private List<Double> result = new ArrayList<Double>();
	private Map<Integer, Double> levelSums = new HashMap<Integer, Double>();
	private Map<Integer, Integer> numberOfMembers = new HashMap<Integer, Integer>();
	
    public List<Double> averageOfLevels(TreeNode root) {
    	traverseTree(root, -1);
    	
    	for (int i = 0; i < levelSums.size(); i++) {
    		double levelAverage;
    		levelAverage = (double)levelSums.get(i) / (double)numberOfMembers.get(i);
    		result.add(levelAverage);
    	}
    	
    	return result;
    }
    
    private void traverseTree(TreeNode node, int level) {
    	level++;
    	if (!levelSums.containsKey(level)) {
    		levelSums.put(level, (double) node.val);
    	}
    	else {
    		
    		double newSum = levelSums.get(level) + node.val;
    		levelSums.put(level, newSum);
    	}
    	
    	if (!numberOfMembers.containsKey(level)) {
    		numberOfMembers.put(level, 1);
    	}
    	else {
    		int newNumberOfMembers = numberOfMembers.get(level) + 1;
    		numberOfMembers.put(level, newNumberOfMembers);
    	}
    	
    	//Recursively traverse
    	if (node.left != null) {
    		traverseTree(node.left, level);
    	}
    	if (node.right != null) {
    		traverseTree(node.right, level);
    	}
    }

}
