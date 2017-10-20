/*
 * Implement Pivot Sort using middle pivots
 * 
 */
public class PivotSortMiddle {
	public void sortAndPartition(int[] inputArray, int start, int end) {
		if (start >= end) {
			return;
		}
		
		int pivot = inputArray[(start + end) / 2];
		int i = start;
		int j = end;
		
		while (i <= j) {
			if (inputArray[i] >= pivot && inputArray[j] <= pivot) {
				int temp = inputArray[i];
				
				inputArray[i] = inputArray[j];
				
				inputArray[j] = temp;
				
				i++;
				
				j--;
			}
			
			if (i <= inputArray.length) {
				if (inputArray[i] < pivot) {
					i++;
				}
			}

			
			if (j >= 0) {
				if (inputArray[j] > pivot) {
					j--;
				}
			}

		}
		
		sortAndPartition(inputArray, start, j);
		
		sortAndPartition(inputArray, i, end);
		
		System.out.println("i: " + i + " j: " + j);
	}
}
