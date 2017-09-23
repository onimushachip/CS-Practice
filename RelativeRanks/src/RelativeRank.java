import java.util.Arrays;
import java.util.HashMap;

public class RelativeRank {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        HashMap<Integer, Integer> oldIndexList = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
        	oldIndexList.put(nums[i], i);
        }
        
        Arrays.sort(nums); //Reverse order
        
        if (nums.length <= 3) {
        	int indexNums = nums.length - 1;
        	while (indexNums >= 0) {
        		if (indexNums == nums.length - 1) {
        			result[oldIndexList.get(nums[indexNums])] = "Gold Medal";
        		}
        		else if (indexNums == nums.length - 2) {
        			result[oldIndexList.get(nums[indexNums])] = "Silver Medal";
        		}
        		else if (indexNums == nums.length - 3) {
        			result[oldIndexList.get(nums[indexNums])] = "Bronze Medal";
        		}
        		
        		indexNums--;
        	}
        	return result;
        }
        
        int place = 4;
        for (int i = result.length - 4; i >= 0; i--) {
        	int oldIndex = oldIndexList.get(nums[i]);
        	result[oldIndex] = Integer.toString(place);
        	place++;
        }
        
        result[oldIndexList.get(nums[nums.length - 1])] = "Gold Medal";
        result[oldIndexList.get(nums[nums.length - 2])] = "Silver Medal";
        result[oldIndexList.get(nums[nums.length - 3])] = "Bronze Medal";
    	
        return result;
    }

}
