/*
 * Implement Bubble Sort with improvements over O(n^2)
 * 
 */

public class BubbleSortImproved {
	public void bubbleSort(int[] inputArray) {
		boolean isSorted = true;
		
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = 0; j < inputArray.length - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					
					inputArray[j] = inputArray[j + 1];
					
					inputArray[j + 1] = temp;
					
					isSorted = false;
				}
			}
			
			if (isSorted) {
				break;
			}
		}
	}
}
