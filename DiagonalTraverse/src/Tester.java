import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		DiagonalTraverse ob = new DiagonalTraverse();
//		int[][] input = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9}
//		};
		
//		int[][] input = {
//				{1, 2},
//				{3, 4},
//				{5, 6}
//		};
		
		int[][] input = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int[] result = ob.findDiagonalOrder(input);
		
		System.out.println(Arrays.toString(result));

	}

}
