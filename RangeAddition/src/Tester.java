
public class Tester {

	public static void main(String[] args) {
		int[][] ops = new int[2][2];
		ops[0][0] = 2;
		ops[0][1] = 2;
		ops[1][0] = 1;
		ops[1][1] = 1;
		RangeAddition ob = new RangeAddition();
		ob.maxCount(2, 3, ops);

	}

}
