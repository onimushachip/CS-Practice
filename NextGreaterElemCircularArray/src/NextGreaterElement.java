import java.util.Stack;

/*
 * Given a circular array (the next element of the last element is the first element of the array), 
 * print the Next Greater Number for every element. The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, 
 * which means you could search circularly to find its next greater number. 
 * If it doesn't exist, output -1 for this number.
 * 
 */
public class NextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
    	if (nums.length == 1) {
    		nums[0] = -1;
    		
    		return nums;
    	}
    	
    	int[] givenArray = nums;
    	Stack<Integer> decreaseNumberIndexes = new Stack<Integer>();
    	int[] result = new int[nums.length];
    	
    	for (int i = 0; i < givenArray.length; i++) {
    		result[i] = -1;
    	}
    	
    	for (int i = 0; i < givenArray.length; i++) {
    		int processNumber = givenArray[i];
    		
    		if (decreaseNumberIndexes.isEmpty()) {
    			decreaseNumberIndexes.push(i);
    		}
    		else {
        		if (processNumber <= givenArray[decreaseNumberIndexes.peek()]) {
        			decreaseNumberIndexes.push(i);
        		}
        		else {
        			int stackSize = decreaseNumberIndexes.size();
        			
        			for (int j = 0; j < stackSize; j++) {
        				if (processNumber > givenArray[decreaseNumberIndexes.peek()]) {
        					result[decreaseNumberIndexes.pop()] = processNumber;
        				}
        			}
        			
        			decreaseNumberIndexes.push(i);
        		}
    		}
    	}
    	
    	for (int i = 0; i < givenArray.length; i++) { //Run a second pass since the given array is circular
    		int processNumber = givenArray[i];
    		
    		if (decreaseNumberIndexes.isEmpty()) {
    			decreaseNumberIndexes.push(i);
    		}
    		else {
        		if (processNumber > givenArray[decreaseNumberIndexes.peek()]) {
        			int stackSize = decreaseNumberIndexes.size();
        			
        			for (int j = 0; j < stackSize; j++) {
        				if (processNumber > givenArray[decreaseNumberIndexes.peek()]) {
        					result[decreaseNumberIndexes.pop()] = processNumber;
        				}
        			}
        		}
    		}
    	}
    	
    	return result;
    }

}
