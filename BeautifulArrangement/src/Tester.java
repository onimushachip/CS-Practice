import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int test = 4;
		
		BeautifulArrangement ob = new BeautifulArrangement();
		
		test = ob.countArrangement(test);
		
//		System.out.println("Result: " + test);
		
		int test2 = 3;
		
		BeautifulArrangement2 ob2 = new BeautifulArrangement2();
		
		int[] result = ob2.constructArray(5, 4);
		
		System.out.println(Arrays.toString(result));
	}

}
