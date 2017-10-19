import java.util.Arrays;

/*
 * Implement MergeSort to sort characters in a string
 * 
 */

public class MergeSortString {
	public String sortString(String input) {
		char[] givenString = input.toCharArray();
		char[] result = mergeSort(givenString);
		
		return new String(result);
	}
	
	private char[] mergeArrays(char[] leftArray, char[] rightArray) {
		char[] result = new char[leftArray.length + rightArray.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		
		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex] <= rightArray[rightIndex]) {
				result[resultIndex] = leftArray[leftIndex];
				
				resultIndex++;
				
				leftIndex++;
			}
			else {
				result[resultIndex] = rightArray[rightIndex];
				
				resultIndex++;
				
				rightIndex++;
			}
		}
		
		while (leftIndex < leftArray.length) {
			result[resultIndex] = leftArray[leftIndex];
			
			leftIndex++;
			
			resultIndex++;
		}
		
		while (rightIndex < rightArray.length) {
			result[resultIndex] = rightArray[rightIndex];
			
			rightIndex++;
			
			resultIndex++;
		}
		
		return result;
	}
	
	private char[] mergeSort(char[] inputArray) {
		if (inputArray.length < 2) {
			return inputArray;
		}
		
		char[] leftArray = Arrays.copyOfRange(inputArray, 0, inputArray.length / 2);
		char[] rightArray = Arrays.copyOfRange(inputArray, inputArray.length / 2, inputArray.length);
		char[] result;
		
		leftArray = mergeSort(leftArray);
		
		rightArray = mergeSort(rightArray);
		
		result = mergeArrays(leftArray, rightArray);
		
		return result;
	}
}
