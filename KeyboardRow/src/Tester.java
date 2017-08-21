import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		String[] test = { "ada", "alaska", "new", "Ada" };
		String row = "qwerty";
		char[] testArray = test[1].toCharArray();
//		System.out.println(row.contains(testArray[0]));
		KeyboardRowCheck ob = new KeyboardRowCheck();
		String result = Arrays.toString(ob.findWords(test));
		System.out.println(result);
	}

}
