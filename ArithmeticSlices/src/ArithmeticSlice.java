/*
 * A sequence of number is called arithmetic if it consists of at least three elements and 
 * if the difference between any two consecutive elements is the same.
 * 
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 * The function should return the number of arithmetic slices in the array A.
 * 
 */

public class ArithmeticSlice {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0;
        int[] givenNumbers = A;
//        boolean slice = false;
        int sliceLength = 1;
        
        for (int i = 0; i < A.length - 1; i++) {
        	int difference = givenNumbers[i] - givenNumbers[i + 1];
        	
        	sliceLength = 1;
        	
//        	slice = false;
        	
        	for (int j = i; j < A.length - 1; j++) {
        		if (givenNumbers[j] - givenNumbers[j + 1] == difference) {
        			sliceLength++;
        			
        			if (sliceLength >= 3) {
        				result++;
        			}
        		}
        		else {
        			break;
        		}
        	}
        	
        }
        
    	return result;
    }
}
