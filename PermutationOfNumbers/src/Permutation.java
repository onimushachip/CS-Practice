import java.util.ArrayList;
import java.util.List;

/*
 * Given a collection of distinct numbers, return all possible permutations.
 * 
 */
public class Permutation {
	private List<List<Integer>> result = new ArrayList<List<Integer>>();
	private List<Integer> permutation = new ArrayList<Integer>();
	private int[] population;
	private boolean[] helper;
    public List<List<Integer>> permute(int[] nums) {
    	population = nums;
    	
    	helper = new boolean[nums.length];
    	
    	findPermutation(population.length);
    	
    	return result;
    }
    
    public void findPermutation(int layer) {
    	if (layer == 1) {
    		for (int i = 0; i < population.length; i++) {
    			if (helper[i] == false) {
    				permutation.add(population[i]);
    				result.add(new ArrayList<Integer>(permutation));
    				permutation.remove(permutation.size() - 1);
 
    			}
    		}
    	}
    	else {
    		for (int i = 0; i < population.length; i++) {
    			if (helper[i] == false) {
    				helper[i] = true;
    				permutation.add(population[i]);
    				findPermutation(layer - 1);
    				helper[i] = false;
    				permutation.remove(permutation.size() - 1);
    			}
    		}
    	}
    	
    }

}
