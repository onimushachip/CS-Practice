/*
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of 
 * each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. 
 * If a cell has less than 8 surrounding cells, then use as many as you can.
 * 
 */
public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
    	int row = M.length;
    	int col = M[0].length;
    	int[][] result = new int[row][col];

    	if (row == col && row == 1) {
    		return M;
    	}
    	
    	if (row == 1 && col > 1) {
    		horizontalArray(M, result, row, col);
    		return result;
    	}
    	
    	if (col == 1 && row > 1) {
    		verticalArray(M, result, row, col);
    		return result;
    	}
    	
    	fourCorners(M, result, row, col);
    	fourBorderLines(M, result, row, col);
    	inner(M, result, row, col);
    	
    	return result;
    }
    
    private void horizontalArray(int[][] input, int[][] result, int inputRow, int inputCol) {
    	double sum;
    	//Head
    	sum = (double)input[0][0]
    		+ (double)input[0][1];
    	result[0][0] = (int)Math.floor(sum/2.0);
    	
    	//Tail
    	sum = (double)input[0][inputCol - 1]
        	+ (double)input[0][inputCol - 2];
        result[0][inputCol - 1] = (int)Math.floor(sum/2.0);
    	
    	//Inner
        for (int i = 1; i < inputCol - 1; i++) {
        	sum = (double)input[0][i] 
    			+ (double)input[0][i - 1]
				+ (double)input[0][i + 1];
        	result[0][i] = (int)Math.floor(sum/3.0);
        }
    	
    }
    
    private void verticalArray(int[][] input, int[][] result, int inputRow, int inputCol) {
    	double sum;
    	//Top
    	sum = (double)input[0][0]
    		+ (double)input[1][0];
    	result[0][0] = (int)Math.floor(sum/2.0);
    			
    	//Bot
    	sum = (double)input[inputRow - 1][0]
        	+ (double)input[inputRow - 2][0];
        result[inputRow - 1][0] = (int)Math.floor(sum/2.0);
    	
    	//Inner
        for (int i = 1; i < inputRow - 1; i++) {
        	sum = (double)input[i][0]
        		+ (double)input[i - 1][0]
        		+ (double)input[i + 1][0];
        	result[i][0] = (int)Math.floor(sum/3.0);
        }
    }
    
    private void inner(int[][] input, int[][] result, int inputRow, int inputCol) {
    	//Average is sum divided by 9.0
    	double sum;
    	for (int i = 1; i < inputRow - 1; i++) {
    		for (int j = 1; j < inputCol - 1; j++) {
    			sum = (double)input[i][j]
					+ (double)input[i][j - 1]
					+ (double)input[i][j + 1]
					+ (double)input[i - 1][j - 1]
					+ (double)input[i - 1][j + 1]
					+ (double)input[i - 1][j]
					+ (double)input[i + 1][j - 1]
					+ (double)input[i + 1][j + 1]
					+ (double)input[i + 1][j];
    			result[i][j] = (int)Math.floor(sum/9.0);
    		}
    	}
    	
    }
    
    private void fourBorderLines(int[][] input, int[][] result, int inputRow, int inputCol) {
    	//Average is sum divided by 6.0
    	double sum;
    	
    	//Up
    	for (int i = 1; i < inputCol - 1; i++) {
    		sum = (double)input[0][i]
    				+ (double)input[0][i - 1]
					+ (double)input[0][i + 1]
					+ (double)input[1][i - 1]
					+ (double)input[1][i + 1]
					+ (double)input[1][i];
    		result[0][i] = (int)Math.floor(sum / 6.0);
    	}
    	
    	//Down
    	for (int i = 1; i < inputCol - 1; i++) {
    		sum = (double)input[inputRow - 1][i]
				+ (double)input[inputRow - 1][i - 1]
				+ (double)input[inputRow - 1][i + 1]
				+ (double)input[inputRow - 2][i]
				+ (double)input[inputRow - 2][i - 1]
				+ (double)input[inputRow - 2][i + 1];
    		result[inputRow - 1][i] = (int)Math.floor(sum/6.0);
    	}
    	
    	//Left
    	for (int j = 1; j < inputRow - 1; j++) {
    		sum = (double)input[j][0]
				+ (double)input[j - 1][0]
				+ (double)input[j + 1][0]
				+ (double)input[j - 1][1]
				+ (double)input[j][1]
				+ (double)input[j + 1][1];
    		result[j][0] = (int)Math.floor(sum/6.0);
    	}
    	
    	//Right
    	for (int j = 1; j < inputRow - 1; j++) {
    		sum = (double)input[j][inputCol - 1]
				+ (double)input[j - 1][inputCol - 1]
				+ (double)input[j + 1][inputCol - 1]
				+ (double)input[j][inputCol - 2]
				+ (double)input[j - 1][inputCol - 2]
				+ (double)input[j + 1][inputCol - 2];
    		result[j][inputCol - 1] = (int)Math.floor(sum/6.0);
    	}
    }
    
    private void fourCorners(int[][] input, int[][] result, int inputRow, int inputCol) {
    	double sum;
    	//top-left
    	sum = (double)input[0][0] 
			+ (double)input[0][1] 
			+ (double)input[1][0] 
			+ (double)input[1][1];
    	result[0][0] = (int)Math.floor(sum/4.0);
    	//top-right
    	sum = (double)input[0][input[0].length - 1]
			+ (double)input[0][input[0].length - 2]
			+ (double)input[1][input[1].length - 1]
			+ (double)input[1][input[1].length - 2];
    	result[0][result[0].length - 1] = (int)Math.floor(sum/4.0);
    	//bot-left
    	sum = (double)input[input.length - 1][0] 
			+ (double)input[input.length - 2][0] 
			+ (double)input[input.length - 1][1] 
			+ (double)input[input.length - 2][1];
    	result[result.length - 1][0] = (int)Math.floor(sum/4.0);
    	//bot-right
    	sum = (double)input[input.length - 1][input[0].length - 1] 
			+ (double)input[input.length - 1][input[0].length - 2] 
			+ (double)input[input.length - 2][input[0].length - 1] 
			+ (double)input[input.length - 2][input[0].length - 2];
    	result[input.length - 1][input[0].length - 1] = (int)Math.floor(sum/4.0);
    }

}
