import java.util.ArrayList;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		FizzBuzz ob = new FizzBuzz();
		List<String> test = ob.fizzBuzz(15);
		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
	}

}
