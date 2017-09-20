import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
//		boolean[] test = new boolean[3];
		int[] test = {1, 2, 3, 4};
		ArrayList<Integer> permutation = new ArrayList<Integer>();
//		System.out.println(Arrays.toString(test));
		Permutation ob = new Permutation();
//		ob.permute(test);
//		ob.findPermutation(4);
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		result = ob.permute(test);
		
//		permutation.add(1);
//		result.add(permutation);
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
//			System.out.println(Arrays.asList(result.get(i)));
		}
		
		System.out.println(result.size());
	}

}
