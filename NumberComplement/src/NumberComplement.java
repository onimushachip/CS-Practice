
public class NumberComplement {
	public int findComplement(int num) {
		String binaryString = Integer.toBinaryString(num);
		String complementString = "";
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				complementString += '0';
			}
			else {
				complementString += 1;
			}
		}
		int newNum = Integer.parseInt(complementString, 2);
        return newNum;
    }
	
	public int findComplementBitwise(int num) {
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(~num & ((Integer.highestOneBit(num) << 1) - 1)));
		return ~num & ((Integer.highestOneBit(num) << 1) - 1);
	}

}
