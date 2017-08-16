import java.util.Arrays;
import java.util.Random;


public class QuickSort {

	public static void main(String[] args) {
		int[] array = new int[9];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int value = rand.nextInt(51);
			array[i] = value;
		}
		
		System.out.println(Arrays.toString(array));
		
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}
	
	public static int partition(int inputArray[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = inputArray[(left + right)/2];
		System.out.println("pivot is " + pivot);
		System.out.println("i is " + i + " || j is " + j);
		System.out.println(Arrays.toString(inputArray));
		
		while (i <= j) {
			while (inputArray[i] < pivot) {
				i++;
			}
			while (inputArray[j] > pivot) {
				j--;
			}
			if (i <= j) {
				tmp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = tmp;
				i++;
				j--;
			}
		}
		System.out.println("i is " + i + " || j is " + j);
		System.out.println(Arrays.toString(inputArray));
		
		return i;
	}
	
	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1) {
			quickSort(arr, left, index - 1);
		}
		if (index < right) {
			quickSort(arr, index, right);
		}
	}
	
//	static int partition(int arr[], int left, int right)
//	{
//	      int i = left, j = right;
//	      int tmp;
//	      int pivot = arr[(left + right) / 2];
//	     
//	      while (i <= j) {
//	            while (arr[i] < pivot)
//	                  i++;
//	            while (arr[j] > pivot)
//	                  j--;
//	            if (i <= j) {
//	                  tmp = arr[i];
//	                  arr[i] = arr[j];
//	                  arr[j] = tmp;
//	                  i++;
//	                  j--;
//	            }
//	      };
//	     
//	      return i;
//	}
//	 
//	static void quickSort(int arr[], int left, int right) {
//	      int index = partition(arr, left, right);
//	      if (left < index - 1)
//	            quickSort(arr, left, index - 1);
//	      if (index < right)
//	            quickSort(arr, index, right);
//	}

}
