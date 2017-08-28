/*
 * Calculate the sum of two integers a and b, 
 * but you are not allowed to use the operator + and -.
 * 
 */
public class SumOfTwoIntegers {
	private int result;
    public int getSum(int a, int b) {
    	if (a == 0) {
    		return b;
    	}
    	if (b == 0) {
    		return a;
    	}
    	
    	while (b != 0) {
    		int carryBit = a & b;
    		a = a ^ b;
    		b = carryBit << 1;
    	}
        
    	result = a;
    	
    	return result;
    }
}
