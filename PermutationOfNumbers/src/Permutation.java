import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
    	
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(Arrays.asList(result.get(i)));
//		}
    	
//    	permutation.add(1);
//    	result.add(permutation);
//    	permutation.add(2);
//    	result.add(permutation);
    	
    	return result;
    }
    
    public void findPermutation(int layer) {
    	if (layer == 1) {
    		for (int i = 0; i < population.length; i++) {
    			if (helper[i] == false) {
    				permutation.add(population[i]);
//       				System.out.println(Arrays.asList(permutation) + " " + Arrays.toString(helper));
    				result.add(new ArrayList<Integer>(permutation));
    				permutation.remove(permutation.size() - 1);
 
    			}
//    			if (i == population.length - 1) {
//    				System.out.println("clear");
//    				permutation.clear();
//    			}
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
