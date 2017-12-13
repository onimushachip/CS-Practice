import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Find all possible combinations of k numbers that add up to a number n, 
 * given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 * 
 */

public class CombinationSum {
	private ArrayList<Integer> combination = new ArrayList<Integer>();
	
    public List<List<Integer>> combinationSum3(int k, int n) {
    	findValidComb(1, k, n);
    	
        return null;
    }
    
    private void findValidComb(int nextInt, int layer, int totalSum) {
    	int sum = 0;
    	
    	for (int i = 0; i < this.combination.size(); i++) {
    		sum += this.combination.get(i);
    	}
    	
    	if (sum > totalSum) {
    		return;
    	}
    	
    	if (layer == 0) {
    		if (sum == totalSum) {
    			System.out.println(Arrays.asList(combination));
    		}
    	}
    	
    	for (int i = nextInt; i <= 9; i++) {
    		this.combination.add(i);
    		
    		findValidComb(i + 1, layer - 1, totalSum);
    		
    		this.combination.remove(combination.size() - 1);
    	}
    	
    }

}
