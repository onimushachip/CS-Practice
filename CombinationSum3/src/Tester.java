import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		CombinationSum ob = new CombinationSum();
		
		List<List<Integer>> result = ob.combinationSum3(4, 29);
		
		System.out.println("The number of combination(s) is: " + result.size());
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(Arrays.asList(result.get(i)));
		}
		
	}

}
