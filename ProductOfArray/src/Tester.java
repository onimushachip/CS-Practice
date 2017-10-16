import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		ProductOfArray ob = new ProductOfArray();
		int[] test = {1};
		
		int[] result = ob.productExceptSelf(test);
		
		System.out.println(Arrays.toString(result));
	}

}
