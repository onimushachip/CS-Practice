import java.util.HashMap;

/*
 * Implement a MapSum class with insert, and sum methods.
 * For the method insert, you'll be given a pair of (string, integer).
 * The string represents the key and the integer represents the value. 
 * If the key already existed, then the original key-value pair will be overridden to the new one.
 * For the method sum, you'll be given a string representing the prefix,
 * and you need to return the sum of all the pairs' value whose key starts with the prefix.
 * 
 */
public class MapSum {
	private HashMap<String, Integer> storage = new HashMap<>();
	
    public MapSum() {
    	
    }
    
    public void insert(String key, int val) {
        this.storage.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
    	
        for (String key : this.storage.keySet()) {
        	if (key.length() >= prefix.length()) {
        		if (key.substring(0, prefix.length()).equals(prefix)) {
        			sum += this.storage.get(key);
        		}
        	}	
        }
    	
    	return sum;
    }

}
