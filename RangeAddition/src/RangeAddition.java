import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an m * n matrix M initialized with all 0's and several update operations.
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive integers 
 * a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 * You need to count and return the number of maximum integers in the matrix after performing all the operations.
 * 
 */
public class RangeAddition {
    public int maxCount(int m, int n, int[][] ops) {
    	int result = 0;
    	int maxValue = ops.length;
    	Map<String, Integer> matrix = new HashMap<String, Integer>();
    	
    	matrix = initialize(m, n);
//    	for (String element : matrix.keySet()) {
//    		System.out.println(element + " " + matrix.get(element));
//    	}
    	
    	for (int opsSize = 0; opsSize < ops.length; opsSize ++) {
    		String coordinate = "";
//    		System.out.println("");
    		for (int i = 0; i < ops[opsSize][0]; i++) { //row
    			for (int j = 0; j < ops[opsSize][1]; j++) { //column
    				coordinate = Integer.toString(i + 1) + Integer.toString(j + 1);
//    				System.out.println(coordinate);
    				matrix.put(coordinate, matrix.get(coordinate) + 1);
    			}
    		}
    	}
    	
    	for (String element : matrix.keySet()) {
    		if (matrix.get(element) == maxValue) {
    			result++;
    		}
    	}
    	 	
//    	System.out.println(result);
        return result;
    }
    
    private Map<String, Integer> initialize(int row, int col) {
    	Map<String, Integer> input = new HashMap<String, Integer>();
    	int i = 1; //row
    	int j = 1; //column
    	int numberOfElements = row * col;
    	
    	for (int k = 1; k <= numberOfElements; k++) {
    		if (k % col == 0) {
    			input.put(Integer.toString(i) + Integer.toString(j), 0);
    			j = 1;
    			i++;
    		}
    		else {
    			input.put(Integer.toString(i) + Integer.toString(j), 0);
    			j++;
    		}
    	}
    	
    	return input;
    }

}
