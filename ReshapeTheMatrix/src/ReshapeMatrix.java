/*
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c 
 * representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; 
 * Otherwise, output the original matrix.
 * 
 */

public class ReshapeMatrix {
	int[][] result = null;
	int resultRow = 0;
	int resultCol = 0;
	
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int totalElements = nums.length * nums[0].length;
        if (totalElements == r * c) {
        	result = new int[r][c];
        }
        else {
        	return nums;
        }
        
        for (int i = 0; i < nums.length; i++) {
        	for (int j = 0; j < nums[0].length; j++) {
        		addElement(nums[i][j]);
        	}
        }
        
        printResult();
    	
    	return result;
    }
    
    
    private void addElement(int input) {
    	if (resultCol >= result[0].length) {
    		resultCol = 0;
    		resultRow++;
    	}
//    	System.out.println(resultRow + " " + resultCol);
    	result[resultRow][resultCol] = input;
    	resultCol++;
    }
    
    public void printResult() {
    	for (int i = 0; i < result.length; i++) {
    		for (int j = 0; j < result[0].length; j++) {
    			System.out.print(result[i][j] + " ");
    		}
    		System.out.print("\n");
    	}
    }

}
