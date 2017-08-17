import java.util.Arrays;
import java.util.Random;


public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[9];
		Random rand = new Random();
//		array[0] = 14;
//		array[1] = 46;
//		array[2] = 20;
//		array[3] = 25;
//		array[4] = 1;
//		array[5] = 3;
//		array[6] = 7;
//		array[7] = 29;
//		array[8] = 26;
		
		for (int i = 0; i < array.length; i++) {
			int value = rand.nextInt(51);
			array[i] = value;
		}
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("Result");
		bubbleSort(array, 0, 1);
		
		System.out.println(Arrays.toString(array));
		

	}
	
	public static void bubbleSort(int[] inputArray, int index1, int index2) {
		int pairUnsorted = inputArray.length - 1;
		while (pairUnsorted > 0) {
			if (index2 > inputArray.length - 1) {
				index1 = 0;
				index2 = 1;
				pairUnsorted = inputArray.length - 1;
			}
			
			if (inputArray[index1] > inputArray[index2]) {
				int temp = inputArray[index1];
				inputArray[index1] = inputArray[index2];
				inputArray[index2] = temp;
				index1 = index2;
				index2++;
			}
			else {
				pairUnsorted--;
				index1 = index2;
				index2++;
			}
		}
	}

}
