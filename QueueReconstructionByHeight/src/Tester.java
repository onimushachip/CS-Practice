import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[][] testInput = {
				{0, 0},
				{6, 2},
				{5, 5},
				{4, 3},
				{5, 2},
				{1, 1},
				{6, 0},
				{6, 3},
				{7, 0},
				{5, 1}
		};
		
		QueueReconstruction ob = new QueueReconstruction();
		
		testInput = ob.reconstructQueue(testInput);
		
		System.out.println(Arrays.toString(testInput[0]));
		
//		QueueReconstructionSum ob = new QueueReconstructionSum();
//		
//		testInput = ob.reconstructQueue(testInput);
	}

}
