import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		WellFormedParentheses ob = new WellFormedParentheses();
		List<String> result = new ArrayList<String>();
		
		result = ob.generateParenthesis(7);
		
//		System.out.println(Arrays.asList(result));
		
		WellFormedPerenthesesImproved ob2 = new WellFormedPerenthesesImproved();
		
		result = ob2.generateParenthesis(7);
		
		System.out.println(Arrays.asList(result));
	}

}
