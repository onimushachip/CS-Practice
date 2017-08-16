import java.util.Arrays;
import java.util.Random;


public class SortingArray {

	public static void main(String[] args) {
		int[] array = new int[9];
		int[] array2 = new int[4];
		Random rand = new Random();
		array[0] = 1;
		array[1] = 12;
		array[2] = 5;
		array[3] = 26;
		array[4] = 7;
		array[5] = 14;
		array[6] = 3;
		array[7] = 7;
		array[8] = 2;
		array2[0] = 14;
		array2[1] = 7;
		array2[2] = 26;
		array2[3] = 12;
//		array[9] = 23;
//		array[10] = 46;
//		array[11] = 23;
//		array[12] = 1;
//		array[13] = 78;
//		array[14] = 4;
//		array[15] = 3;
//		array[16] = 6;
//		array[17] = 8;
//		array[18] = 3;
//		array[19] = 9;
		
//		for (int i = 0; i < array.length; i++) {
//			int value = rand.nextInt(51);
//			array[i] = value;
//		}
//		
		
//		System.out.println(Arrays.toString(array));
//		sortArray(array);
//		partitionArray(array);
		partitionArrayLight(array, 0, array.length - 1);
//		sortPivot(array2, 2);
		
	}
	
	public static void partitionArray(int[] inputArray) {
		if (inputArray.length == 1) {
			System.out.println(Arrays.toString(inputArray));
		}
		else {
			System.out.println(Arrays.toString(inputArray));
			int[] firstHalf = new int[inputArray.length/2];
			int[] secondHalf = new int[(int) Math.ceil((double)inputArray.length/2)];
			System.arraycopy(inputArray, 0, firstHalf, 0, inputArray.length/2);
			System.arraycopy(inputArray, inputArray.length/2, secondHalf, 0, (int) Math.ceil((double)inputArray.length/2));
			System.out.println(Arrays.toString(firstHalf));
			System.out.println(Arrays.toString(secondHalf));
//			System.out.println((int) Math.ceil((double)inputArray.length/2));
			partitionArray(firstHalf);
			partitionArray(secondHalf);
		}
	}
	
	public static void partitionArrayLight(int[] inputArray, int head, int tail) {
		if (Math.abs(tail - head) <= 1) {
			System.out.println(inputArray[head]);
//			System.out.println("head is " + head);
//			System.out.println("tail is " + tail);
		}
		else {
			for (int i = head; i <= tail; i++) {
				System.out.print(inputArray[i] + " ");
			}
			System.out.print("\n");
//			System.out.println(tail);
			int center = head + (int) Math.abs(Math.ceil((double)((tail - head)/2)));
			int pivot = inputArray[center];
			int i = head;
			int j = tail; 
			System.out.println(pivot);
			//quick sort
			while (i <= j && i < tail && j > head) {
//				System.out.println("i is " + i);
//				System.out.println("j is " + j);
				if (j > inputArray.length - 1) {
					j = inputArray.length - 1;
				}
				if (inputArray[i] >= pivot && inputArray[j] <= pivot) {
					//swap
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					i++;
					j--;
				}
				else if (inputArray[i] < pivot) {
					i++;
				}
				else if (inputArray[j] > pivot) {
					j--;
				}
				else {
					i++;
					j--;
				}
			}
			System.out.println("i is " + i);
			System.out.println("j is " + j);
			
//			System.out.println(inputArray[center]);
//			System.out.println(center);
//			System.out.println(head);
//			System.out.println(tail);
			System.out.println(Arrays.toString(inputArray));
			partitionArrayLight(inputArray, head, j);
			partitionArrayLight(inputArray, i, tail);
		}
	}
	
	public static void sortArray(int[] inputArray) {
		int maxInt = inputArray[0];
		for (int i = 0; i < inputArray.length; i++) {
			maxInt = inputArray[i];
			int maxIntIndex = i;
			for (int j = i; j < inputArray.length; j++ ) {
				if (maxInt < inputArray[j]) {
					maxInt = inputArray[j];
					maxIntIndex = j;
				}
			}
//			System.out.println(maxInt);
//			System.out.print(" stored in the index " + maxIntIndex + "\n");
			System.out.println(Arrays.toString(inputArray));
			//swap
			inputArray[maxIntIndex] = inputArray[i];
			inputArray[i] = maxInt;
			
		}
	}
	
	public static void sortPivot(int[] inputArray, int center) {
//		int pivot = inputArray[center];
//		int i = 0;
//		int j = inputArray.length - 1; 
//		System.out.println(pivot);
//		while (i < j) {
//			if (inputArray[i] >= pivot && inputArray[j] <= pivot) {
//				//swap
//				int temp = inputArray[i];
//				inputArray[i] = inputArray[j];
//				inputArray[j] = temp;
//				i++;
//				j--;
//			}
//			else if (inputArray[i] < pivot) {
//				i++;
//			}
//			else if (inputArray[j] > pivot) {
//				j--;
//			}
//			else {
//				i++;
//				j--;
//			}
//		}
		
		//ver2
		int i = 0, j = inputArray.length - 1;
		int temp;
		int pivot = inputArray[(i + j)/2];
		
		while (i <= j) {
			while (inputArray[i] < pivot) {
				i++;
			}
			while (inputArray[j] > pivot) {
				j--;
			}
			if (i <= j) {
				temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
				i++;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
}


