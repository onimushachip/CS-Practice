
public class KeyboardRowCheck {
	String row1 = "qwertyuiop";
	String row2 = "asdfghjkl";
	String row3 = "zxcvbnm";
	String[] result = new String[0];
	
    public String[] findWords(String[] words) {
//        String[] result = new String[0];
        
        for (int i = 0; i < words.length; i++) {
        	System.out.println(words[i]);
        	if (checkStringInRow(words[i], row1)) {
        		result = new String[result.length + 1];
        		result[result.length - 1] = words[i];
        	}
        	else if (checkStringInRow(words[i], row2)) {
        		result = new String[result.length + 1];
        		result[result.length - 1] = words[i];
        	}
        	else if (checkStringInRow(words[i], row3)) {
        		result = new String[result.length + 1];
        		result[result.length - 1] = words[i];
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
    		result = new String[result.length + 1];
    		result[result.length - 1] = input;
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
		System.out.println(input);
		if (!inputRow.contains(input)) {
			return false;
		}
		
		return true;
	}

}
