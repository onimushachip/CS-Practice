import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given two integers n and k, you need to construct a list which 
 * contains n different positive integers ranging from 1 to n and obeys the following requirement: 
 * Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
 * If there are multiple answers, print any of them.
 * 
 */

public class BeautifulArrangement2 {
	private int[] result;
	private int[] permutation;
	private Set<Integer> distinctSet = new HashSet<Integer>();
	
    public int[] constructArray(int n, int k) {
    	ArrayList<Integer> givenNumbers = new ArrayList<Integer>();
    	
    	for (int i = 1; i <= n; i++) {
    		givenNumbers.add(i);
    	}
    	
    	this.permutation = new int[givenNumbers.size()];
    	
    	createPermutation(givenNumbers, givenNumbers.size(), k);
        
    	return this.result;
    }
    
    private void createPermutation(ArrayList<Integer> givenNumbers, int layer, int distinct) {
    	int numberAmount = givenNumbers.size();
    	int permuIndex = this.permutation.length - layer;
    	
    	if (layer == 1) {
    		int checkedNumber = givenNumbers.get(0);
    		
    		givenNumbers.remove(0);
    		
    		this.permutation[permuIndex] = checkedNumber;
//    		System.out.println(Arrays.toString(permutation));
    		if (checkArrangement(this.permutation, distinct)) {
    			this.result = Arrays.copyOf(this.permutation, this.permutation.length);
    		}
    		
    		givenNumbers.add(checkedNumber);
    		
    		return;
    	}
    	
    	for (int i = 0; i < numberAmount; i++) {
    		int checkedNumber = givenNumbers.get(i);
    		
    		givenNumbers.remove(i);
    		
    		this.permutation[permuIndex] = checkedNumber;
    		
    		createPermutation(givenNumbers, layer - 1, distinct);
    		
    		givenNumbers.add(i, checkedNumber);
    		
    		if (checkArrangement(this.result, distinct)) {
    			break;
    		}
    	}
    }
    
    private boolean checkArrangement(int[] arrangement, int distinct) {
    	this.distinctSet.clear();
    	
    	if (arrangement == null) {
    		return false;
    	}
    	
    	for (int i = 0; i < arrangement.length - 1; i++) { //The number of diff needed to compute is the length of the list - 1
    		int difference = arrangement[i] - arrangement[i + 1];
    		
    		this.distinctSet.add(difference);
    	}
    	
    	if (this.distinctSet.size() != distinct) {
    		return false;
    	}
    	
    	return true;
    }
}
