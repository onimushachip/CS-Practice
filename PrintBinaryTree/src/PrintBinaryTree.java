import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PrintBinaryTree {
    public List<List<String>> printTree(TreeNode root) {
        Queue<TreeNode> treeLevel = new LinkedList<TreeNode>();
        Stack<List<List<String>>> levelList = new Stack<>();
    	
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
        
    	return null;
    }
}
