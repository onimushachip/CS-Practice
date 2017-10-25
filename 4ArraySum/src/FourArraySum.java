import java.util.HashMap;

/*
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * To make problem a bit easier, all A, B, C, D have same length of N where 0 <= N <= 500. 
 * All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.
 * 
 */
public class FourArraySum {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        HashMap<Integer, Integer> valueMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < A.length; i++) {
        	for (int j = 0; j < B.length; j++) {
        		int sum = A[i] + B[j];
        		
        		if (valueMap.containsKey(sum)) {
        			valueMap.put(sum, valueMap.get(sum) + 1);
        		}
        		else {
        			valueMap.put(sum, 1);
        		}
        	}
        }
        
        for (int i = 0; i < C.length; i++) {
        	for (int j = 0; j < D.length; j++) {
        		int secondSum = C[i] + D[j];
        		
        		int sumZeroOccurrence = 0;
        		
        		if (valueMap.containsKey(-secondSum)) {
        			sumZeroOccurrence = valueMap.get(-secondSum);
        		}
        		
        		result+= sumZeroOccurrence;
        	}
        }
    	
    	return result;
    }

}
