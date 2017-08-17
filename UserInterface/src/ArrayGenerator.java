import java.util.Arrays;
import java.util.Random;


public class ArrayGenerator {
	private String result;
	private int[] randomArray = new int[15];
	
	public void generateString() {
		Random rand = new Random();
//		int[] randomArray = new int[15];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(100);
		}
		result = Arrays.toString(randomArray);
	}
	
	public String getResult() {
		return result;
	}
	
	public void sortArray() {
		bubbleSort(randomArray, 0, randomArray.length - 1);
		result = Arrays.toString(randomArray);
	}
	
	public void bubbleSort(int[] inputArray, int index1, int index2) {
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
