import java.util.ArrayList;
import java.util.HashMap;

/* 
 * Given the root of a tree, you are asked to find the most frequent subtree sum. 
 * The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). 
 * So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
 * 
 */

public class FrequentSubtreeSum {
	private int[] result;
	private HashMap<Integer, Integer> sumOccurrence = new HashMap<Integer, Integer>();
	
    public int[] findFrequentTreeSum(TreeNode root) {
        
    	findSum(root);
    	
    	int maxOccurrence = 0;
    	ArrayList<Integer> sumList = new ArrayList<Integer>();
    	
    	for (Integer sum : sumOccurrence.keySet()) {
    		int occurrence = sumOccurrence.get(sum);
    		
    		if (occurrence > maxOccurrence) {
    			sumList.clear();
    			
    			sumList.add(sum);
    			
    			maxOccurrence = occurrence;
    		}
    		else if (occurrence == maxOccurrence) {
    			sumList.add(sum);
    		}
    	}
    	
    	this.result = new int[sumList.size()];
    	
    	for (int i = 0; i < this.result.length; i++) {
    		this.result[i] = sumList.get(i);
    	}
    	
    	return this.result;
    }
    
    private int findSum(TreeNode node) {
    	if (node == null) {
    		return 0;
    	}
    	
    	int sum = node.val;
    	int sumLeft = findSum(node.left);
    	int sumRight = findSum(node.right);
    	
    	sum += (sumLeft + sumRight);
    	
//    	System.out.println(sum);
    	if (sumOccurrence.containsKey(sum)) {
    		int occurrence = sumOccurrence.get(sum);
    		
    		sumOccurrence.put(sum, occurrence + 1);
    	}
    	else {
    		sumOccurrence.put(sum, 1);
    	}
    	
    	return sum;
    }

}
