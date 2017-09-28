import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), 
 * where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. 
 * Write an algorithm to reconstruct the queue.
 * 
 */
public class QueueReconstruction {
	private int[][] result = null;
	private ArrayList<int[]> remainItem = new ArrayList<int[]>();
	private HashMap<Integer, Integer> itemInQueue = new HashMap<Integer, Integer>();
	private ArrayList<int[]> constructedQ = new ArrayList<>();
	
    public int[][] reconstructQueue(int[][] people) {
    	result = new int[people.length][];
    	
    	constructRemainList(people);
    	
    	addRemainingPeople();
    	
    	for (int i = 0; i < result.length; i++) {
    		result[i] = constructedQ.get(i);
    	}
    	
    	return result;
    }
    
    private void constructRemainList(int[][] people) {
    	ArrayList<int[]> peopleList = new ArrayList<int[]>();
    	ArrayList<int[]> resultQ = new ArrayList<int[]>();
    	
    	for (int i = 0; i < people.length; i++) {
    		peopleList.add(people[i]);
    	}
    	
    	while (!peopleList.isEmpty()) {
        	int minSum = Integer.MAX_VALUE;
        	int heightCandidate = Integer.MAX_VALUE;
        	int candidateIndex = 0;
        	
    		for (int i = 0; i < peopleList.size(); i ++) {
    			int sum = peopleList.get(i)[0] + peopleList.get(i)[1];
    			int height = peopleList.get(i)[0];
    			if (sum <= minSum) {
    				if (sum == minSum) {
        				if (height < heightCandidate) {
        					candidateIndex = i;
        					heightCandidate = height;
        					minSum = sum;
        				}
    				}
    				else {
    					candidateIndex = i;
    					heightCandidate = height;
    					minSum = sum;
    				}

    			}
    		}
    		
    		resultQ.add(Arrays.copyOf(peopleList.get(candidateIndex), 2));
    		
    		peopleList.remove(candidateIndex);
    	}
    	
    	this.remainItem = resultQ;
    }
    
    private void addRemainingPeople() {
    	int height = 0;
    	int peopleInTheFront = 0;
    	
    	while (remainItem.isEmpty() == false) {
    		for (int i = 0; i < remainItem.size(); i++) {
    			height = remainItem.get(i)[0];
    			
    			if (checkPerson(remainItem.get(i)) == true) {
    				if (itemInQueue.containsKey(height)) {
    					itemInQueue.put(height, itemInQueue.get(height) + 1);
    				}
    				else {
    					itemInQueue.put(height, 1);
    				}
    				
    				constructedQ.add(Arrays.copyOf(remainItem.get(i), remainItem.get(i).length));
    				
    				remainItem.remove(i);
    				
    				break;
    			}
    		}
    	}
    }
    
    private boolean checkPerson(int[] person) {
    	int tallerPeopleInfront = 0;
    	int height = person[0];
    	
    	for (Integer key : itemInQueue.keySet()) {
    		if (height <= key) {
    			tallerPeopleInfront += itemInQueue.get(key);
    		}
    	}
    	
    	if (tallerPeopleInfront != person[1]) {
    		return false;
    	}
    	
    	return true;
    }
    
    private void addFirstPerson() {
    	ArrayList<int[]> candidates = new ArrayList<int[]>();
    	ArrayList<Integer> candidateIndex = new ArrayList<Integer>();
    	
    	for (int i = 0; i < remainItem.size(); i++) {
    		if (remainItem.get(i)[1] == 0) {
    			candidates.add(remainItem.get(i));
    			candidateIndex.add(i);
    		}
    	}
    	
    	int minHeight = candidates.get(0)[0];
    	int minIndex = 0; //Index of the person standing in front in candidates ArrayList
    	
    	for (int i = 0; i < candidates.size(); i++) {
    		if (candidates.get(i)[0] < minHeight) {
    			minHeight = candidates.get(i)[0];
    			minIndex = i;
    		}
    	}
    	
    	this.constructedQ.add(Arrays.copyOf(candidates.get(minIndex), candidates.get(minIndex).length));
    	
    	int indexOftheFirstPerson = candidateIndex.get(minIndex);
    	
    	this.remainItem.remove(indexOftheFirstPerson);
    	
    	this.itemInQueue.put(candidates.get(minIndex)[0], 1);
    }

}
