import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] test = {1, 4, 3, 2, 9, 8, 7, 5, 6};

		PivotSortMiddle ob = new PivotSortMiddle();
		
		ob.sortAndPartition(test, 0, test.length - 1);
		
		System.out.println(Arrays.toString(test));
	}

}
