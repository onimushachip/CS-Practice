import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.
 * You need to help them find out their common interest with the least list index sum. 
 * If there is a choice tie between answers, output all of them with no order requirement. 
 * You could assume there always exists an answer.
 * 
 */
public class MinIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
    	String[] result = null;
    	int minSum = Integer.MAX_VALUE;
    	Queue<String> resultQueue = new LinkedList<String>();
    	HashMap<String, Integer> indexList = new HashMap<String, Integer>();
    	
    	for (int i = 0; i < list1.length; i++) {
    		indexList.put(list1[i], i);
    	}
    	
    	for (int i = 0; i < list2.length; i++) {
    		if (indexList.containsKey(list2[i])) {
    			if ((i + indexList.get(list2[i]) < minSum)) {
    				minSum = i + indexList.get(list2[i]);
    			}
    		}
    	}
    	
    	for (int i = 0; i < list2.length; i++) {
    		if (indexList.containsKey(list2[i])) {
    			if ((i + indexList.get(list2[i]) == minSum)) {
    				resultQueue.add(list2[i]);
    			}
    		}
    	}
    	
    	result = new String[resultQueue.size()];
    	
    	for (int i = 0; i < result.length; i++) {
    		result[i] = resultQueue.poll();
    	}
    	
    	
    	return result;
    }

}
