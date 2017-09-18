import java.util.HashMap;

/*
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) 
 * such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * 
 */
public class NumberOfBoomerang {
    public int numberOfBoomerangs(int[][] points) {
    	int counter = 0;
//    	Set<Integer> distList = new HashSet<Integer>();
    	HashMap<Integer, Integer> distList = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < points.length; i++) {
    		distList = new HashMap<Integer, Integer>();
    		for (int j = 0; j < points.length; j++) {
    			int distance = findDistance(points[i], points[j]);
//    			System.out.println(distance);
    			if (distList.containsKey(distance)) {
//    				counter++;
//    				System.out.println(Arrays.toString(points[i]) + " " + Arrays.toString(points[j]));
    				distList.put(distance, distList.get(distance) + 1);
    				counter += distList.get(distance);
    			}
    			else {
    				distList.put(distance, 0);
    			}
    		}
    		
    	}
    	
    	counter = counter * 2;
     
    	return counter;
    }
    
    public int findDistance(int[] pointA, int[] pointB) { //No SquareRoot
    	int distance =  (pointA[0] - pointB[0])*(pointA[0] - pointB[0]) + (pointA[1] - pointB[1])*(pointA[1] - pointB[1]);
    	
    	return distance;
    }

}
