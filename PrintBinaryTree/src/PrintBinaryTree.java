import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        Queue<TreeNode> treeLevel = new LinkedList<TreeNode>();
        Stack<List<List<String>>> levelList = new Stack<>();
        List<List<String>> result = new ArrayList<>();
    	
        treeLevel.add(root);
        
        while (!treeLevel.isEmpty()) {
        	int treeLevelSize = treeLevel.size();
        	
        	levelList.add(new ArrayList<List<String>>());
        	
        	boolean lastLevelCheck = true;
        	
        	for (int i = 0; i < treeLevelSize; i++) {
        		if (treeLevel.peek() == null) {
        			treeLevel.add(null);
        			
        			treeLevel.add(null);
        			
        			ArrayList<String> outputNode = new ArrayList<String>();
        			
        			outputNode.add("");
        			
        			levelList.peek().add(outputNode);
        		}
        		else {
        			lastLevelCheck = false;
        			
        			treeLevel.add(treeLevel.peek().left);
        			
        			treeLevel.add(treeLevel.peek().right);
        			
        			ArrayList<String> outputNode = new ArrayList<String>();
        			
        			outputNode.add(Integer.toString(treeLevel.peek().val));
        			
        			levelList.peek().add(outputNode);
        		}
        		
        		treeLevel.poll();
        	}
        	
    		if (lastLevelCheck) {
    			levelList.pop();
    			
    			break;
    		}
        }
        
        int numberOfLevels = levelList.size();
        int emptyNodes = 0;
        
        for (int i = 0; i < numberOfLevels; i++) {
        	List<String> outputLevel = new ArrayList<>();
        	
        	for (int j = 0; j < levelList.peek().size(); j++) { //Concatenate one tree level
        		for (int k = 0; k < emptyNodes; k++) {
        			levelList.peek().get(j).add(0, "");
        			
        			levelList.peek().get(j).add("");
        		}
        		
        		outputLevel.addAll(levelList.peek().get(j));
        		
        		if (j != (levelList.peek().size() - 1)) {
        			outputLevel.add("");
        		}
        	}
        	
        	result.add(0, outputLevel);
        	
        	levelList.pop();
        	
        	emptyNodes = (emptyNodes + 1) * 2 - 1;
        }
        
    	return result;
    }
}
