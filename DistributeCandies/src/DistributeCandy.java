import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies. 
 * Each number means one candy of the corresponding kind. 
 * You need to distribute these candies equally in number to brother and sister. 
 * Return the maximum number of kinds of candies the sister could gain.
 * 
 */
public class DistributeCandy {
	final private int emptySlot = 100001;
	
	//Brute force
    public int distributeCandies(int[] candies) {
    	int sisterTypeAmount = 0;
    	int[] sisterCandies = new int[candies.length/2];
    	int totalCandiesIndex = 0;
    	int sisterCandiesIndex = 0;
    	int maxType = candies.length/2;
    	
    	for (int i = 0; i < sisterCandies.length; i++) {
    		sisterCandies[i] = emptySlot;
    	}
    	
    	while (totalCandiesIndex < candies.length) {
    		if (hasCandy(candies[totalCandiesIndex], sisterCandies)) {
    			totalCandiesIndex++;
    		}
    		else {
    			sisterCandies[sisterCandiesIndex] = candies[totalCandiesIndex];
    			sisterTypeAmount++;
    			sisterCandiesIndex++;
    			if (sisterCandiesIndex > sisterCandies.length - 1) {
    				break;
    			}
    			totalCandiesIndex++;
    		}	
    	}
    	
    	System.out.println(Arrays.toString(sisterCandies));
    	
    	return sisterTypeAmount;
    }
    
    private boolean hasCandy(int candy, int[] candyArray) {
    	for (int i = 0; i < candyArray.length; i++) {
    		if (candy == candyArray[i]) {
    			return true;
    		}
    	}
    	return false;
    }
    
    //Using Set
    public int distributeCandiesSet(int[] candies) {
    	int totalCandies = candies.length;
    	Set<Integer> candyTypes = new HashSet<Integer>();
    	
    	for (int i = 0; i < candies.length; i++) {
    		candyTypes.add(candies[i]);
    	}
    	if (candyTypes.size() > totalCandies / 2) {
    		return (totalCandies / 2);
    	}
    	else {
    		return candyTypes.size();
    	}
    	
    }

}
