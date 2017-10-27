import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * Shuffle a set of numbers without duplicates.
 * 
 * Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * 
 * Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 * 
 * Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 * 
 * Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 * 
 */

public class ShuffleArrayMemorize {
	private int[] initNums;
	private ArrayList<int[]> permuList = new ArrayList<int[]>();
	private int[] tempPermu;
	private boolean[] helper; //Keep track of what number is being selected
	
    public ShuffleArrayMemorize(int[] nums) {
        this.initNums = nums;
        this.tempPermu = new int[nums.length];
        this.helper = new boolean[nums.length];
        
        createPermuList(this.initNums.length, 0);
        
        System.out.println("List size: " + this.permuList.size());
    }
    
    private void createPermuList(int layer, int permuIndex) {
    	if (layer == 1) {
    		for (int i = 0; i < this.initNums.length; i++) {
    			if (helper[i] != true) {
    				this.tempPermu[permuIndex] = this.initNums[i];
    				
    				this.permuList.add(Arrays.copyOf(this.tempPermu, this.initNums.length));
    			}
    		}
    		
    		return;
    	}
    	
    	for (int i = 0; i < this.initNums.length; i++) {
    		if (this.helper[i] != true) {
    			this.tempPermu[permuIndex] = this.initNums[i];
    			
        		this.helper[i] = true;
        		
        		createPermuList(layer - 1, permuIndex + 1);
        		
        		this.helper[i] = false;
    		}
    	}
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	return this.initNums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	if (this.permuList.size() == 0) {
    		return new int[0];
    	}
    	
    	Random rand = new Random();
        int randomIndex = rand.nextInt(this.permuList.size());
        int[] result = this.permuList.get(randomIndex);
        
    	return result;
    }
}
