
public class Tester {

	public static void main(String[] args) {
		CountNumber ob = new CountNumber();
		
		int result = ob.countNumbersWithUniqueDigits(4);
		int result2 = ob.countNumberWithUniqueDigitsFast(4);
		
		System.out.println("Result: " + result);
		
		System.out.println("Result: " + result2);
	}

}
