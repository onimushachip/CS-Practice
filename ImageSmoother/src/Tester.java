
public class Tester {

	public static void main(String[] args) {
//		int[][] test = new int[][] {
//				{1, 6, 1, 1},
//				{1, 1, 3, 1},
//				{1, 7, 1, 1},
//				{1, 1, 9, 1}
//		};
		
//		int[][] test = new int[][] {
//				{1, 6, 1, 1}
//		};
		
		int[][] test = new int[][] {
				{1},
				{1},
				{1},
				{1}
		};
		
		ImageSmoother ob = new ImageSmoother();
		test = ob.imageSmoother(test);
		
		for (int i = 0; i < test.length; i++) {
			System.out.println("");
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
		}
		
//		int testSum = (int) Math.ceil(((double)5/(double)2));
//		System.out.println(testSum);

	}

}
