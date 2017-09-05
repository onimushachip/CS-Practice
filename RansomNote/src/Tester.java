
public class Tester {

	public static void main(String[] args) {
		String testString = "aabc";
		String testNote = "aabd";
//		System.out.println(Character.getNumericValue('b'));
//		System.out.println(testString.codePointAt(1));
		
		RansomNote ob = new RansomNote();
		System.out.println(ob.canConstruct(testNote, testString));
		;
	}

}
