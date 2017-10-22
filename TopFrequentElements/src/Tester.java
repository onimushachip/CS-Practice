import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Tester {

	public static void main(String[] args) {
		HashMap<Integer, Integer> testMap = new HashMap<>();
		int[] testInput = {5, 5};
		TopFrequentElement ob = new TopFrequentElement();
		
		testMap.put(null, 0);
		
		ArrayList<Integer> result = ob.topKFrequent(testInput, 2);
		
		System.out.println(Arrays.asList(result));
	}

}
