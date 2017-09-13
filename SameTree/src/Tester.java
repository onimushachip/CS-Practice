import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		RelativeRank ob = new RelativeRank();
		String[] result = null;
		int[] test = {8, 9, 3, 1, 0};
		
		result = ob.findRelativeRanks(test);
		System.out.println(Arrays.toString(result));

	}

}
