
public class Tester {

	public static void main(String[] args) {
//		int test = 1;
		int test = 256;
//		int test2 = 4;
		int test2 = 121;
//		int stringLength = logBase2(test, 2);
//		String binaryString = Integer.toBinaryString(test);
//		binaryString = binaryString.substring(binaryString.length() - stringLength - 2);
//		System.out.println(stringLength);
//		System.out.println(binaryString);
		HammingDistance ob = new HammingDistance();
		HammingDistanceBitwise ob2 = new HammingDistanceBitwise();
//		System.out.println(ob.hammingDistance(test, test2));
//		System.out.println(test ^ test2);
		System.out.println(ob2.hammingDistance(test, test2));
		

	}
	
	public static int logBase2(int inputNumber, int base) {
		int result = (int) Math.ceil(((double)(Math.log(inputNumber)/Math.log(base))));
		return result;
	}

}
