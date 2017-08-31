import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConvertTree {
	private Map<Integer, Integer> nodeList = new HashMap<Integer, Integer>();
	private int[] nodeValueArray;
    public TreeNode convertBST(TreeNode root) {
    	int nodeValueIndex = 0;
    	addTree(root);
    	nodeValueArray = new int[nodeList.size()];
    	
    	for (Integer nodeValue : nodeList.keySet()) {
    		nodeValueArray[nodeValueIndex] = nodeValue;
    		nodeValueIndex++;
    	}
    	
    	Arrays.sort(nodeValueArray);
    	
    	for (Integer nodeValue : nodeList.keySet()) {
    		nodeValueIndex = nodeValueArray.length - 1;
    		while (nodeValueArray[nodeValueIndex] > nodeValue) {
    			nodeList.put(nodeValue, nodeList.get(nodeValue) + nodeValueArray[nodeValueIndex]);
    			nodeValueIndex--;
    		}
    	}
    	
    	convert(root);
    	
    	System.out.println(Arrays.toString(nodeValueArray));
    	System.out.println(Arrays.asList(nodeList));
        
    	return root;
    }

    private void addTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	nodeList.put(root.val, root.val);
    	
		addTree(root.left);
		addTree(root.right);
    }
    
    private void convert(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	root.val = nodeList.get(root.val);
    	
    	convert(root.left);
    	convert(root.right);
    }
}
