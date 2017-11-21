import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		WellFormedParentheses ob = new WellFormedParentheses();
		List<String> result = ob.generateParenthesis(2);
		
		System.out.println(Arrays.asList(result));
	}

}
