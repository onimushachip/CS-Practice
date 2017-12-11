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
    			if (indexRow - 1 < 0) {
    				upDirection = false;
    				
    				if (indexCol + 1 > matrix[0].length - 1) {
    					indexRow++;
    				}
    				else {
    					indexCol++;
    				}
    				
    				resultList.add(matrix[indexRow][indexCol]);
    			}
    			else {
        			indexRow--;
        			
        			if (indexCol + 1 > matrix[0].length - 1) {
        				indexRow += 2;
        				
//        				indexCol--;
        			}
        			else {
        				indexCol++;
        			}
        			
        			resultList.add(matrix[indexRow][indexCol]);
    			}
    		}
    		else {
    			if (indexCol - 1 < 0) {
    				upDirection = true;
    				
    				if (indexRow + 1 > matrix.length - 1) {
    					indexCol++;
    				}
    				else {
    					indexRow++;
    				}
    				
    				resultList.add(matrix[indexRow][indexCol]);
    			}
    			else {
    				indexCol--;
    				
    				if (indexRow + 1 > matrix.length - 1) {
    					upDirection = true;
    					
    					indexCol += 2;
    				}
    				else {
    					indexRow++;
    				}
    				
    				resultList.add(matrix[indexRow][indexCol]);
    			}
    		}
    	}
    	
    	int[] result = new int[resultList.size()];
    	
    	for (int i = 0; i < resultList.size(); i++) {
    		result[i] = resultList.get(i);
    	}
     
    	return result;
    }

}
