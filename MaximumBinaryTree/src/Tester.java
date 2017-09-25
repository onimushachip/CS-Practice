import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] test = {1, 2, 3};
		int[] testCopy;
		int index = 1;
		testCopy = Arrays.copyOfRange(test, 0, index);//
		System.out.println(Arrays.toString(testCopy));
		testCopy = Arrays.copyOfRange(test, index, test.length);
		System.out.println(Arrays.toString(testCopy));
		
		TreeNode n = new TreeNode(1);
	}

}
