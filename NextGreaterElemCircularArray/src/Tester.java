import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int test[] = {5, 2, 12, 8, 9, 6};
		NextGreaterElement ob = new NextGreaterElement();
		
		int[] result = ob.nextGreaterElements(test);
		
		System.out.println("Result: " + Arrays.toString(result));
	}

}
