
public class HammingDistanceBitwise {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        
        while (xor != 0) {
        	System.out.println("xor is: " + Integer.toBinaryString(xor));
        	System.out.println("(xor - 1) is: " + Integer.toBinaryString(xor - 1));
            xor &= (xor - 1);
            System.out.println("xor & (xor - 1): " + Integer.toBinaryString(xor) + "\n");
            count++;
        }
        return count;
    }
}
