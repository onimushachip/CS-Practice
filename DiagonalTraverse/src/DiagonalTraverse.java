import java.util.ArrayList;

/*
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order
 * 
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 
 * Output:  [1,2,4,7,5,3,6,8,9]
 * 
 */

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
    	if (matrix.length == 0) {
    		return new int[0];
    	}
    	
    	int numberOfElements = matrix[0].length * matrix.length;
    	ArrayList<Integer> resultList = new ArrayList<Integer>();
    	int indexRow = 0;
    	int indexCol = 0;
    	boolean upDirection = true;
    	
    	resultList.add(matrix[indexRow][indexCol]);
    	
    	while (resultList.size() < numberOfElements) {
    		if (upDirection) {

    		}
    		else {
    			
    		}
    		
    	}
    	
    	int[] result = new int[resultList.size()];
    	
    	for (int i = 0; i < resultList.size(); i++) {
    		result[i] = resultList.get(i);
    	}
     
    	return result;
    }

}
