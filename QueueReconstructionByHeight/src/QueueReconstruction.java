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
//	private HashMap<Integer, Integer> remainItem = new HashMap<Integer, Integer>();
	
    public int[][] reconstructQueue(int[][] people) {
    	result = new int[people.length][];
    	
    	for (int i = 0; i < people.length; i++) {
//    		remainItem.put(people[i][0], people[i][1]);
    		remainItem.add(people[i]);
    	}
    	
    	addFirstPerson();
    	
    	addRemainingPeople();
    	
//    	System.out.println(checkPerson(people[1]));
    	
    	return result;
    }
    
    private void addRemainingPeople() {
    	int height = 0;
    	int peopleInTheFront = 0;
    	
//    	System.out.println(remainItem.size());
    	
    	while (remainItem.isEmpty() == false) {
    		for (int i = 0; i < remainItem.size(); i++) {
    			height = remainItem.get(i)[0];
    			
//    	    	System.out.println(remainItem.size());
    			
//    			System.out.println(checkPerson(remainItem.get(i)));
    			
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
    	
//    	System.out.println(Arrays.asList(candidateIndex));
    	
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
    	
//    	System.out.println(candidateIndex.get(minIndex) + " " + remainItem.size());
    	
    	this.itemInQueue.put(candidates.get(minIndex)[0], 1);
    	
//    	this.result[0] = Arrays.copyOf(constructedQ.get(0), constructedQ.get(0).length);
    }

}
