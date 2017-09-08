import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] numbers = {2, 3, 4};
		int target = 6;
		
		TwoSum ob = new TwoSum();
		int[] result = ob.twoSum(numbers, target);
		System.out.println(Arrays.toString(result));
	}

}
