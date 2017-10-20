import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] test = {1, 4, 3, 2, 9, 8, 7, 5, 6};
		
		BubbleSortImproved ob = new BubbleSortImproved();
		
		System.out.println("Given:  " + Arrays.toString(test));
		
		ob.bubbleSort(test);
		
		System.out.println("Result: " + Arrays.toString(test));
	}

}
