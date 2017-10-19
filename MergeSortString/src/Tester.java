
public class Tester {

	public static void main(String[] args) {
		String test = "adcbakciwhqengqdzc,nffh";
		
		MergeSortString ob = new MergeSortString();
		
		String result = ob.sortString(test);
		
		System.out.println(result);
		System.out.println(test.codePointAt(0) + " " + test.codePointAt(1));
	}

}
