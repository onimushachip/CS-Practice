
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		String binaryStringX = Integer.toBinaryString(x);
		String binaryStringY = Integer.toBinaryString(y);
		String balanceString = "";
		if (x > y) {
			for (int i = 0; i < binaryStringX.length() - binaryStringY.length(); i++) {
				balanceString = balanceString + '0';
			}
			binaryStringY = balanceString + binaryStringY;
		}
		else {
			for (int i = 0; i < binaryStringY.length() - binaryStringX.length(); i++) {
				balanceString = balanceString + '0';
			}
			binaryStringX = balanceString + binaryStringX;
		}
		
		int iteratorX = binaryStringX.length() - 1;
		int iteratorY = binaryStringY.length() - 1;
		int hammingDistance = 0;
		while (iteratorX >= 0 && iteratorY >= 0) {
			if (binaryStringX.charAt(iteratorX) != binaryStringY.charAt(iteratorY)) {
				hammingDistance++;
			}
			iteratorX--;
			iteratorY--;
		}
		return hammingDistance;
	}
}
