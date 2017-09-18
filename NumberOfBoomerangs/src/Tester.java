
public class Tester {

	public static void main(String[] args) {
//		double test1 = 1.0 / 3.0;
//		double test2 = 1.0 / 3.0;
//		System.out.println(test1);
//		System.out.println((test1 == test2));
		int[][] test = {
				{0, 0},
				{1, 0},
				{-1, 0},
				{0, 1}
		};
//		int[] pointA = {1, 1};
//		int[] pointB = {2, 0};
		NumberOfBoomerang ob = new NumberOfBoomerang();
//		double dis = ob.findDistance(pointA, pointB);
//		System.out.println(dis);
		int result = ob.numberOfBoomerangs(test);
		System.out.println("Result: " + result);
	}

}
