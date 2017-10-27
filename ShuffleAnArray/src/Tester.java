import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ShuffleArrayMemorize ob = new ShuffleArrayMemorize(test);
		
		int[] shuffled = ob.shuffle();
		
		for (int i = 0; i < 10; i ++) {
			shuffled = ob.shuffle();
			System.out.println(Arrays.toString(shuffled));
		}
	}

}
