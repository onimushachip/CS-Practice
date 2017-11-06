
public class PointCalculator {
	private int cummulativeCreditSum;
	private int cummulativePointSum;
	
	public double calculator(int A, int B, int C, int D) {
		double result = 0;
		int classSum = A + B + C + D;
		int pointSum = A*4 + B*3 + C*2 + D;
		
		this.cummulativeCreditSum += classSum;
		
		this.cummulativePointSum += pointSum;
		
		result = (double)pointSum / (double)classSum;
		
		double cummulativeResult = (double)this.cummulativePointSum / (double)this.cummulativeCreditSum;
		
		System.out.println("Result: " + result);
		
		System.out.println("Cummulative: " + cummulativeResult);
		
		return result;
	}

}
