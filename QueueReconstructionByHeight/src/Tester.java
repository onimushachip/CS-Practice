import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[][] testInput = {
				{7, 0},
				{4, 4},
				{7, 1},
				{5, 0},
				{6, 1},
				{5, 2}
		};
		
//		QueueReconstruction ob = new QueueReconstruction();
//		
//		testInput = ob.reconstructQueue(testInput);
//		
//		System.out.println(Arrays.toString(testInput[0]));
		
		QueueReconstructionSum ob = new QueueReconstructionSum();
		
		testInput = ob.reconstructQueue(testInput);
	}

}
