import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* Given scores of N athletes, find their relative ranks and the people with the top three highest scores, 
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 * 
 */
public class RelativeRank {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
//        int maxScore = -1;
        HashMap<Integer, Integer> oldIndexList = new HashMap<Integer, Integer>();
//        Queue<Integer> topThree = new LinkedList<>();
        
        for (int i = 0; i < nums.length; i++) {
//        	if (nums[i] > maxScore) {
//        		maxScore = nums[i];
//        		topThree.add(nums[i]);
//        		if (topThree.size() > 3) {
//        			topThree.poll();
//        		}
//        	}
        	oldIndexList.put(nums[i], i);
        }
        
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); //Reverse order
        
//        result[0] = "Gold Medal";
//        result[1] = "Silver Medal";
//        result[2] = "Bronze Medal";
        
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.asList(oldIndexList));
        
        int place = 4;
        for (int i = result.length - 4; i >= 0; i--) {
        	System.out.println(nums[i]);
        	int oldIndex = oldIndexList.get(nums[i]);
        	result[oldIndex] = Integer.toString(place);
        	place++;
        }
        
//        System.out.println(Arrays.asList(topThree));
    	
        return result;
    }

}
