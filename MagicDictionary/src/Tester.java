
public class Tester {

	public static void main(String[] args) {
		MagicDictionary ob = new MagicDictionary();
		String[] test = new String[2];
		
		test[0] = "hello";
		test[1] = "bye";

		ob.buildDict(test);
		
		boolean result = ob.search("hello");
		
		System.out.println(result);
	}

}
