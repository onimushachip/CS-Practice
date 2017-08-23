import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		int[] test1 = {4, 1, 2};
		int[] test2 = {1, 3, 4, 2};
		NextGreaterElement ob = new NextGreaterElement();
		int[] result = ob.nextGreaterElementHashmap(test1, test2);
		System.out.println(Arrays.toString(result));

	}

}
