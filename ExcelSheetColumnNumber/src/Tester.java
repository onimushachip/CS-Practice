
public class Tester {

	public static void main(String[] args) {
		String test = "AB";
//		System.out.println(test.codePointAt(0) - 64);
//		System.out.println(Math.pow(2.0, 1.0));
		ExcelSheetNumber ob = new ExcelSheetNumber();
		System.out.println(ob.titleToNumber(test));
	}

}
