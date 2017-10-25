
public class Tester {

	public static void main(String[] args) {
		int[] a = {1, 2};
		int[] b = {-2, -1};
		int[] c = {-1, 2};
		int[] d = {0, 2};
		
		FourArraySum ob = new FourArraySum();
		
		int result = ob.fourSumCount(a, b, c, d);
		
		System.out.println("Result: " + result);
	}

}
