/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of 
 * American keyboard like qwerty.
 * 
 */

public class KeyboardRowCheck {
	String row1 = "QWERTYUIOPqwertyuiop";
	String row2 = "ASDFGHJKLasdfghjkl";
	String row3 = "ZXCVBNMzxcvbnm";
	String[] result = new String[0];
	
    public String[] findWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
        	if (checkStringInRow(words[i], row1)) {
        		addWord(words[i]);
        	}
        	else if (checkStringInRow(words[i], row2)) {
        		addWord(words[i]);
        	}
        	else if (checkStringInRow(words[i], row3)) {
        		addWord(words[i]);
        	}
        }
        
        return result;	
    }
    
    private void addWord(String input) {
    	if (result.length == 0) {
    		result = new String[1];
    		result[0] = input;
    	}
    	else {
    		String[] newResult = new String[result.length + 1];
    		System.arraycopy(result, 0, newResult, 0, result.length);
    		newResult[newResult.length - 1] = input;
    		result = newResult;
    	}
    }
    
    private boolean checkStringInRow(String input, String row) {
    	for (int i = 0; i < input.length(); i++) {
    		if (!checkCharacterInRow(input.charAt(i), row)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public boolean checkCharacterInRow(char inputChar, String inputRow) {
		String input = "";
		input += inputChar;
		if (!inputRow.contains(input)) {
			return false;
		}
		
		return true;
	}

}
