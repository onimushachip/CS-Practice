
public class Tester {

	public static void main(String[] args) {
//		System.out.println(3 / 2);
		int[] test = {0, 1};
		MissingNumber ob = new MissingNumber();
		int result = ob.missingNumberBinarySearch(test);
		System.out.println(result);
		result = ob.missingNumberLinear(test);
		System.out.println(result);

	}

}
