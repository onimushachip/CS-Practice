import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 * 
 */
public class MinimumDifferenceBST {
    public int getMinimumDifference(TreeNode root) {
    	int result = Integer.MAX_VALUE;
    	int[] resultArray;
    	int resultArrayIndex = 0;
    	Set<Integer> setValue =  new HashSet<Integer>();
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	traverseTree(root, setValue);
    	System.out.println(setValue.size());
    	
    	if (setValue.size() == 1) {
    		return 0;
    	}
    	
        resultArray = new int[setValue.size()];
       
        
        for (Integer value : setValue) {
        	resultArray[resultArrayIndex] = value;
        	resultArrayIndex++;
        }
        
        Arrays.sort(resultArray);
        
        for (int i = resultArray.length - 1; i > 0; i--) {
        	int difference = resultArray[i] - resultArray[i - 1];
        	if (result > difference) {
        		result = difference;
        	}
        }
    	
    	return result;
    }
    
    private void traverseTree(TreeNode root, Set<Integer> set) {
//    	throw Exception("PRogram suck!")
    	set.add(root.val);
    	
    	if (root.left != null) {
    		traverseTree(root.left, set);
    	}
    	
    	if (root.right != null) {
    		traverseTree(root.right, set);
    	}
    }
}
