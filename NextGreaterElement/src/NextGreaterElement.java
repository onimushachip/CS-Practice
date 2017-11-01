import java.util.HashMap;
import java.util.Map;

/*
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. 
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. 
 * If it does not exist, output -1 for this number.
 * 
 */


public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    	int[] result = new int[nums1.length];
    	int index1 = 0;
    	int index2 = 0;
    	
    	for (int i = 0; i < result.length; i++) {
    		result[i] = -1;
    	}
        
    	while (index1 < nums1.length) {
    		index2 = 0; //start at the beginning of nums2 for each number in nums1
    		while (index2 < nums2.length) {
    			//find the corresponding number in nums2
    			if (nums2[index2] == nums1[index1]) {
    				//find the next greater element if existing
    				while (index2 < nums2.length) {
    					if (nums2[index2] > nums1[index1]) {
    						result[index1] = nums2[index2];
    						break;
    					}
    					index2++;
    				}
    			}
    			index2++;
    		}
    		index1++;
    	}
    
    	return result;
    }
    
    public int[] nextGreaterElementHashmap(int[] nums1, int[] nums2) {
    	Map<Integer, Integer> nums2Position = new HashMap<Integer, Integer>();
    	int nums1Index = 0;
    	int nums2Index = 0;
    	int processNumber = 0;
    	
    	//Store positions of nums2 elements in a hashmap
    	for (int i = 0; i < nums2.length; i++) {
    		nums2Position.put(nums2[i], i);
    	}
    	
    	while (nums1Index < nums1.length) {
    		nums2Index = nums2Position.get(nums1[nums1Index]);
    		
    		processNumber = nums1[nums1Index];
    		
    		nums1[nums1Index] = -1;
    		
    		while (nums2Index < nums2.length) {
    			if (nums2[nums2Index] > processNumber) {
    				nums1[nums1Index] = nums2[nums2Index];
    				
    				break;
    			}
    			
    			nums2Index++;
    		}
    		
    		nums1Index++;
    	}
    	
    	return nums1;
    }
}
