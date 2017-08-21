
public class KeyboardRowCheck {
	String row1 = "QWERTYUIOPqwertyuiop";
	String row2 = "ASDFGHJKLasdfghjkl";
	String row3 = "ZXCVBNMzxcvbnm";
	String[] result = new String[0];
	
    public String[] findWords(String[] words) {
//        String[] result = new String[0];
        
        for (int i = 0; i < words.length; i++) {
//        	System.out.println(result.length);
//        	System.out.println(words[i]);
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
//    	System.out.println(input);
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
//		System.out.println(input);
		if (!inputRow.contains(input)) {
			return false;
		}
		
		return true;
	}

}
