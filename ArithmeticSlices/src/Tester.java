
public class Tester {

	public static void main(String[] args) {
		int[] test = {1, 1, 2, 5, 7};
		
		ArithmeticSlice ob = new ArithmeticSlice();

		int result = ob.numberOfArithmeticSlices(test);
		
		System.out.println("Result: " + result);
	}

}
