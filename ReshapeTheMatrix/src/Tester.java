import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		int[][] test = new int[2][2];
		test[0][0] = 1;
		test[0][1] = 2;
		test[1][0] = 3;
		test[1][1] = 4;	
//		int totalElements = test.length * test[0].length;
//		System.out.println(totalElements);
//		System.out.println(Arrays.toString(test));
		ReshapeMatrix ob = new ReshapeMatrix();
		int[][] result = ob.matrixReshape(test, 1, 4);
	}

}
