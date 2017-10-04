import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		SingleNumber ob = new SingleNumber();
		int[] test = {1, 2, 2, 3, 4, 1, 4};
		int result = ob.singleNumber(test);
		
		System.out.println(result);
		
		SingleNumberVariation ob2 = new SingleNumberVariation();
		int[] test2 = {1, 2, 1, 3, 2, 5};
		int[] result2 = ob2.singleNumber(test2);
		
		System.out.println(Arrays.toString(result2));
	}

}
