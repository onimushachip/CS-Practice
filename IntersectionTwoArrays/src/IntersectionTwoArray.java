import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two arrays, write a function to compute their intersection.
 * 
 */
public class IntersectionTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
    	int[] result = new int[0];
    	Set<Integer> resultSet = new HashSet<Integer>();
    	Set<Integer> distinctValues = new HashSet<Integer>();
    	
    	if (nums1 == null || nums2 == null) {
    		return result;
    	}
    	
    	if (nums1.length == 0 || nums2.length == 0) {
    		return result;
    	}
    	
    	for (int i = 0; i < nums1.length; i++) {
    		distinctValues.add(nums1[i]);
    	}
    	
    	for (int i = 0; i < nums2.length; i++) {
    		if (distinctValues.contains(nums2[i])) {
    			resultSet.add(nums2[i]);
    		}
    	}
    	
    	result = new int[resultSet.size()];
    	int resultIndex = 0;
    	for (Integer value : resultSet) {
    		result[resultIndex] = value;
    		resultIndex++;
    	}
    	
    	return result;
    }
}
