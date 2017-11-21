import java.util.ArrayList;
import java.util.List;

public class WellFormedPerenthesesImproved {
	public List<String> result = new ArrayList<String>();
	StringBuilder tempCombination = new StringBuilder();
	
	public List<String> generateParenthesis(int n) {
		buildCombination(tempCombination, 0, 0, n);
		
		return result;
	}
	
	private void buildCombination(StringBuilder tempString, int open, int close, int pairNumber) {
		if (tempString.length() == pairNumber * 2) {
			this.result.add(this.tempCombination.toString());
			
			return;
		}
		
		if (open < pairNumber) {
			this.tempCombination.append('(');
			
			buildCombination(tempString, open + 1, close, pairNumber);
			
			this.tempCombination.deleteCharAt(tempCombination.length() - 1);
		}
		
		if (close < open) {
			this.tempCombination.append(')');
			
			buildCombination(tempString, open, close + 1, pairNumber);
			
			this.tempCombination.deleteCharAt(tempCombination.length() - 1);
		}
	}

}
