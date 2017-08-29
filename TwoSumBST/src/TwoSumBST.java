import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a Binary Search Tree and a target number, 
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 * 
 */

public class TwoSumBST {
	private ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
    public boolean findTarget(TreeNode root, int k) {
    	traverseTree(root);
    	
    	while (!nodeList.isEmpty()) {
    		int processValue = nodeList.get(0).val;
    		int sum = 0;
    		nodeList.remove(0);
//    		Iterator nodeListIterator = nodeList.iterator();
    		for (int i = 0; i < nodeList.size(); i++) {
    			sum = processValue + nodeList.get(i).val;
    			if (sum == k) {
    				System.out.println(true);
    				return true;
    			}
    		}
    	}
    	
//    	System.out.println(Arrays.asList(nodeList));
        
    	return false;
    }
    
    public void traverseTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	nodeList.add(root);
    	if (root.left != null) {
    		traverseTree(root.left);
    	}
    	if (root.right != null) {
    		traverseTree(root.right);
    	}
    }
}
