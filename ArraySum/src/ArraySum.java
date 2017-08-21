import java.util.Arrays;

/*Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) 
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * 
 */
public class ArraySum {
	private int[] inputArray;
	
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		inputArray = nums;
		bubbleSort(inputArray, 0, 1);
		System.out.println(Arrays.toString(inputArray));
		int index = inputArray.length - 1;
		while (index > 0) {
			sum += Math.min(inputArray[index], inputArray[index - 1]);
			index -= 2;
		}
		if (inputArray.length == 1) {
			sum = inputArray[0];
			return sum;
		}
		
		return sum;
	}
	
	//Can be replaced by Arrays.sort(int[] input)
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
