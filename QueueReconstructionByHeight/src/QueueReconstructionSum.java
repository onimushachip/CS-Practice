import java.util.ArrayList;
import java.util.Arrays;

/*
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), 
 * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. 
 * Write an algorithm to reconstruct the queue.
 * 
 */
public class QueueReconstructionSum {
	private int[][] result;
    public int[][] reconstructQueue(int[][] people) {
    	this.result = new int[people.length][];
//    	int resultIndex = 0;
    	ArrayList<int[]> peopleList = new ArrayList<int[]>();
    	ArrayList<int[]> resultQ = new ArrayList<int[]>();
    	
    	for (int i = 0; i < people.length; i++) {
//    		int h = people[i][0];
//    		int k = people[i][1];
    		peopleList.add(people[i]);
    	}
    	

    	
    	while (!peopleList.isEmpty()) {
        	int minSum = Integer.MAX_VALUE;
        	int heightCandidate = Integer.MAX_VALUE;
        	int candidateIndex = 0;
        	
    		for (int i = 0; i< peopleList.size(); i ++) {
    			int sum = peopleList.get(i)[0] + peopleList.get(i)[1];
    			int height = peopleList.get(i)[0];
    			if (sum <= minSum) {
    				if (height > heightCandidate) {
    					candidateIndex = i;
    					heightCandidate = height;
    					minSum = sum;
    				}
    			}
    		}
    		
    		resultQ.add(Arrays.copyOf(peopleList.get(candidateIndex), 2));
    		
    		peopleList.remove(candidateIndex);
    	}
    	
        return result;
    }
}
