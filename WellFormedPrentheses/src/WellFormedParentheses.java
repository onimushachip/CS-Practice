import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * 
 */

public class WellFormedParentheses {
	private ArrayList<Character> tempCombination = new ArrayList<Character>();
	private HashSet<String> resultSet = new HashSet<String>();
	
    public List<String> generateParenthesis(int n) {
    	ArrayList<String> resultList = new ArrayList<String>();
    	
    	for (int i = 0; i < n; i++) {
    		tempCombination.add('(');
    	}
    	
    	buildCombination(n);
    	
    	for (String combination : resultSet) {
    		resultList.add(combination);
    	}
        
    	return resultList;
    }
    
    private void buildCombination(int layer) {
    	if (layer == 1) {
    		for (int i = 0; i <= this.tempCombination.size(); i++) {
    			this.tempCombination.add(i, ')');
    			
    			if (checkValid(this.tempCombination)) {
    				StringBuilder resultCombination = new StringBuilder();
    				
    				for (int j = 0; j < this.tempCombination.size(); j++) {
    					resultCombination.append(this.tempCombination.get(j));
    				}
    				
					String resultString = resultCombination.toString();
					
					this.resultSet.add(resultString);
    			}
    			
    			this.tempCombination.remove(i);
    		}
    		
    		return;
    	}
    	
    	for (int i = 0; i <= this.tempCombination.size(); i++) {
    		this.tempCombination.add(i, ')');
    		
    		if (checkValid(this.tempCombination)) {
    			buildCombination(layer - 1);
    		}
    		
    		this.tempCombination.remove(i);
    	}
    }
    
    private boolean checkValid(ArrayList<Character> input) {
    	int currentSlot = 0;
    	
    	for (int i = 0; i < input.size(); i++) {
    		if (input.get(i) == '(') {
    			currentSlot++;
    		}
    		else {
    			currentSlot--;
    		}
    		
    		if (currentSlot < 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
