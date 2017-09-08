/*
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
    	int[] result = new int[2];
    	int indexHead = 0;
    	int indexTail = numbers.length - 1;
    	
    	while (true) {
    		int sum = numbers[indexHead] + numbers[indexTail];
    		if (sum < target) {
    			indexHead++;
    		}
    		else if (sum > target) {
    			indexTail--;
    		}
    		if (indexHead > indexTail || sum == target) {
    			break;
    		}
    	}
    	
    	result[0] = indexHead + 1;
    	result[1] = indexTail + 1;
    	
    	return result;
    }
	
	
	//Bubble search
    public int[] twoSumBubble(int[] numbers, int target) {
    	int[] result = new int[2];
    	
    	for (int i = 0; i < numbers.length; i++) {
    		for (int j = i; j < numbers.length; j++) {
    			if ((numbers[i] + numbers[j]) == target) {
    				result[0] = i;
    				result[1] = j;
    				break;
    			}
    		}
    	}
    	
    	return result;
    }
	
	
	//Without negative numbers
    public int[] twoSumPositive(int[] numbers, int target) {
    	int[] result = new int[2];
    	int pivot = -1;
    	
    	for (int i = 0; i < numbers.length; i++) {
    		if (numbers[i] >= target) {
    			pivot = i;
                break;
    		}
            pivot = numbers.length;
    	}

    	int sum = target - 1;
    	result[0] = 0;
    	result[1] = pivot - 1;
    	
    	while (sum != target) {
    		System.out.println("result0: " + result[0] + " result1: " + result[1]);
    		sum = numbers[result[0]] + numbers[result[1]];
    		if (sum < target) {
    			result[0] += result[0] + 1;
    		}
    		else if (sum > target) {
    			result[1] = result[1] - 1;
    		}
    	}
        
        result[0]++;
        result[1]++;
    	
    	return result; 
    }

}
