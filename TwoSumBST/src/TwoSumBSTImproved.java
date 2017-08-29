import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBSTImproved {
	private Map<Integer, Integer> nodeValueList = new HashMap<Integer, Integer>();
	private int checkValue = 0;
	private boolean result = false;
    public boolean findTarget(TreeNode root, int k) {
    	checkValue = k;
    	traverseTree(root);
    	
    	return result;
    }
    
    public void traverseTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	if (nodeValueList.containsKey(checkValue - root.val)) {
    		result = true;
    		return;
    	}
    	
    	nodeValueList.put(root.val, root.val);
    	if (root.left != null) {
    		traverseTree(root.left);
    	}
    	if (root.right != null) {
    		traverseTree(root.right);
    	}
    }

}
