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
	private ArrayList<int[]> remainQ = new ArrayList<int[]>();
	private HashMap<Integer, Integer> itemInQueue = new HashMap<Integer, Integer>();
	private ArrayList<int[]> resultQ = new ArrayList<>();
	
    public int[][] reconstructQueue(int[][] people) {
    	result = new int[people.length][];
    	
    	constructRemainList(people);
    	
    	addRemainingPeople();
    	
    	for (int i = 0; i < result.length; i++) {
    		result[i] = resultQ.get(i);
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
        	int tallerPeopleMin = Integer.MAX_VALUE;
        	int heightCandidate = Integer.MAX_VALUE;
        	int candidateIndex = 0;
        	
    		for (int i = 0; i < peopleList.size(); i ++) {
    			int tallerPeople = peopleList.get(i)[1]; 
    			int height = peopleList.get(i)[0];
    			
    			if (tallerPeople <= tallerPeopleMin) {
    				if (tallerPeople == tallerPeopleMin) {
    					if (height < heightCandidate) {
    						heightCandidate = height;
    						
    						tallerPeopleMin = tallerPeople;
    						
    						candidateIndex = i;
    					}
    					
    				}
    				else {
    					heightCandidate = height;
    					
    					tallerPeopleMin = tallerPeople;
    					
    					candidateIndex = i;
    				}
    			}
    		}
    		
    		resultQ.add(Arrays.copyOf(peopleList.get(candidateIndex), 2));
    		
    		peopleList.remove(candidateIndex);
    	}
    	
    	this.remainQ = resultQ;
    }
    
    private void addRemainingPeople() {
    	while (!remainQ.isEmpty()) {
    		int tallerPeople = 0;
    		int tallerPeopleNeeded = remainQ.get(0)[1];
    		int processHeight = remainQ.get(0)[0];
    		int candidateIndex = 0;
    		
    		for (int i = 0; i < resultQ.size(); i++) {
    			int height = resultQ.get(i)[0];
    		
    			if (height >= processHeight) {
    				tallerPeople++;
    				
    				candidateIndex = i;
    				
    				if (tallerPeople > tallerPeopleNeeded) {
    					break;
    				}	
    			}
    			
    			candidateIndex = i;
    		}
    		
    		if (candidateIndex == resultQ.size() - 1 && (tallerPeople == tallerPeopleNeeded)) {
    			resultQ.add(remainQ.get(0));
    		}
    		else {
    			resultQ.add(candidateIndex, remainQ.get(0));
    		}
    		
    		remainQ.remove(0);
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
    	
    	for (int i = 0; i < remainQ.size(); i++) {
    		if (remainQ.get(i)[1] == 0) {
    			candidates.add(remainQ.get(i));
    			
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
    	
    	this.resultQ.add(Arrays.copyOf(candidates.get(minIndex), candidates.get(minIndex).length));
    	
    	int indexOftheFirstPerson = candidateIndex.get(minIndex);
    	
    	this.remainQ.remove(indexOftheFirstPerson);
    	
    	this.itemInQueue.put(candidates.get(minIndex)[0], 1);
    }

}
