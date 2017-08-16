import java.util.Arrays;
import java.util.Random;


public class MergeSort {

	public static void main(String[] args) {
		int[] test = {1, 3, 4, 7, 12, 6, 23, 4, 5};
		Random rand = new Random();
		for (int i = 0; i < test.length; i++) {
			test[i] = rand.nextInt(90);
		}
//		partitionArray(test, 0, test.length - 1);
//		mergeSort(test, 0, test.length - 1);
		
		MergeSort object = new MergeSort();
		object.mergeSort(test, 0, test.length - 1);
		
		System.out.println(Arrays.toString(test));
		
	}

	public static void partitionArray(int[] inputArray, int left, int right) {
		int middle = (left + right)/2;
		int[] helperLeft = new int[middle - left + 1];
		int[] helperRight = new int[right - middle];
//		System.out.println(left);
		if (inputArray.length > 1) {
			for (int i = 0; i < helperLeft.length; i++) {
				helperLeft[i] = inputArray[i + left];
			}
			for (int j = 0; j < helperRight.length; j++) {
				helperRight[j] = inputArray[j + middle + 1]; //mid inclusion, added 1 to fix
			}
//			System.out.println(Arrays.toString(helperLeft) + " " + Arrays.toString(helperRight));
			partitionArray(helperLeft, 0, helperLeft.length - 1);
			partitionArray(helperRight, 0, helperRight.length - 1);
		}
		else {
			System.out.println(Arrays.toString(inputArray));
		}
//		return inputArray;
	}
	
	void merge(int[]inputArray, int left, int middle, int right) {
		int[] subArrayLeft = new int[middle - left + 1];
		int[] subArrayRight = new int[right - middle];
		
		for (int i = 0; i < subArrayLeft.length; i++) {
			subArrayLeft[i] = inputArray[i + left];
		}
		for (int j = 0; j < subArrayRight.length; j++) {
			subArrayRight[j] = inputArray[j + middle + 1];
		}
		
		int i = 0, j = 0;
		int current = left;
		
		while (i < subArrayLeft.length && j < subArrayRight.length) {
//			System.out.println("check");
			if (subArrayLeft[i] < subArrayRight[j]) {
				inputArray[current] = subArrayLeft[i];
				i++;
//				System.out.println(Arrays.toString(inputArray));
			}
			else {
				inputArray[current] = subArrayRight[j];
				j++;
			}
			current++;
		}
		
		while (i < subArrayLeft.length) {
			inputArray[current] = subArrayLeft[i];
			i++;
			current++;
		}
		
		while (j < subArrayRight.length) {
			inputArray[current] = subArrayRight[j];
			j++;
			current++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	void mergeSort(int[] inputArray, int left, int right) {
		if (left < right) {
			int middle = (left+ right)/2;
			
			mergeSort(inputArray, left, middle);
			mergeSort(inputArray, middle + 1, right);
			
			merge(inputArray, left, middle, right);
		}
//		System.out.println(Arrays.toString(inputArray));
	}
	
}
