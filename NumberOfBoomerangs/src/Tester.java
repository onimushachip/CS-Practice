
public class Tester {

	public static void main(String[] args) {
		int[][] test = {
				{0, 0},
				{1, 0},
				{-1, 0},
				{0, 1}
		};
		NumberOfBoomerang ob = new NumberOfBoomerang();
		int result = ob.numberOfBoomerangs(test);
		System.out.println("Result: " + result);
	}

}
