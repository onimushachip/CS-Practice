
public class Tester {

	public static void main(String[] args) {
//		int[] test = {1, 1, 2, 2, 3, 3};
//		int[] test = {1, 1, 1, 2};
		int[] test = {1, 2, 2, 2, 2, 2};
		DistributeCandy ob = new DistributeCandy();
		int result = ob.distributeCandies(test);
		System.out.println(result);
	}

}
