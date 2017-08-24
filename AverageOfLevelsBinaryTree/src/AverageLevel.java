import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AverageLevel {
	private List<Double> result = new ArrayList<Double>();
	private Map<Integer, Double> levelSums = new HashMap<Integer, Double>();
	private Map<Integer, Integer> numberOfMembers = new HashMap<Integer, Integer>();
	
    public List<Double> averageOfLevels(TreeNode root) {
    	
    	traverseTree(root, -1);
    	
//    	System.out.println(Arrays.asList(levelSums));
//    	System.out.println(Arrays.asList(numberOfMembers));
    	
    	for (int i = 0; i < levelSums.size(); i++) {
    		double levelAverage;
    		levelAverage = (double)levelSums.get(i) / (double)numberOfMembers.get(i);
    		result.add(levelAverage);
    	}
    	
//    	System.out.println(Arrays.asList(result));
    	
    	return result;
    }
    
    private void traverseTree(TreeNode node, int level) {
    	level++;
//    	System.out.println(node.val);
//    	System.out.println(node.left);
//    	System.out.println(node.right);
    	if (!levelSums.containsKey(level)) {
    		levelSums.put(level, (double) node.val);
    	}
    	else {
//    		System.out.println("level sum: " + levelSums.get(levelSums));
//    		System.out.println(levelSums.containsKey(level));
//    		System.out.println(Arrays.asList(levelSums));
    		
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
