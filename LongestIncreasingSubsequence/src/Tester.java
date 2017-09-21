
public class Tester {

	public static void main(String[] args) {
//		int[] test = {1, 2, 3, 4, 2, 1, 2, 3, 4, 5};
		int[] test = {3, 2, 1};
		LongestSubsequence ob = new LongestSubsequence();
		int result = ob.findLengthOfLCIS(test);
		System.out.println(result);

	}

}
