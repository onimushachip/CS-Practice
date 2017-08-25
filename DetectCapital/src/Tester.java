
public class Tester {

	public static void main(String[] args) {
		DetectCapital ob = new DetectCapital();
		String test = "USE";
		String test2 = "Hello";
		String test3 = "WahR";
		System.out.println(ob.detectCapitalUse(test));
		System.out.println(ob.detectCapitalUse(test2));
		System.out.println(ob.detectCapitalUse(test3));
	}

}
