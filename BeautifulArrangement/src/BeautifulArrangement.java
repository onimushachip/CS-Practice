import java.util.ArrayList;
import java.util.Arrays;

/*
 * Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 <= i <= N) in this array:
 * The number at the ith position is divisible by i.
 * i is divisible by the number at the ith position.
 * Now given N, how many beautiful arrangements can you construct?
 * 
 */
public class BeautifulArrangement {
	private int result = 0;
	private ArrayList<Integer> givenNumbers = new ArrayList<Integer>();
	private int[] arrangement;
	
    public int countArrangement(int N) {
    	for (int i = 1; i <= N; i++) {
    		givenNumbers.add(i);
    	}
    	
    	this.arrangement = new int[N];
    	
    	findArrangement(N, 1);
        
    	return result;
    }
    
    private void findArrangement(int layer, int index) {
    	if (layer == 0) {
    		return;
    	}
    	
    	int listSize = this.givenNumbers.size();
    	
    	
    	for (int i = 0; i < listSize; i++) {
    		if ((index % givenNumbers.get(i) == 0) || (givenNumbers.get(i) % index == 0)) {
    			int checkedNumber = givenNumbers.get(i);
    			
    			arrangement[index - 1] = checkedNumber;
    			
    			givenNumbers.remove(i);
    			
    			if (layer == 1) {
    				this.result++;
    				System.out.println(Arrays.toString(arrangement));
    			}
    			
    			findArrangement(layer - 1, index + 1);
    			
    			givenNumbers.add(i, checkedNumber);
    		}
    	}
    }
}
