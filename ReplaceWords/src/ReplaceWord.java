import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. 
 * For example, the root an, followed by other, which can form another word another.
 * Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. 
 * If a successor has many roots can form it, replace it with the root with the shortest length.
 * You need to output the sentence after the replacement.
 * 
 */
public class ReplaceWord {
    public String replaceWords(List<String> dict, String sentence) {
    	char[] resultArray;
    	Set<String> dictSet = new HashSet<String>();
    	
    	for (int i = 0; i < dict.size(); i++) {
    		dictSet.add(dict.get(i));
    	}
    	
    	resultArray = findWords(dictSet, sentence);
        
    	return new String(resultArray);
    }
    
    private String transformWord(String word, Set<String> dictSet) {
    	String scanWord = "";
    	
    	for (int i = 1; i <= word.length(); i++) {
    		scanWord = word.substring(0, i);
    		
    		if (dictSet.contains(scanWord)) {
    			return scanWord;
    		}
    	}
    	
    	return word;
    }
    
    private char[] findWords(Set<String> dictSet, String input) {
    	String word = null;
    	int wordStartIndex = -1;
    	boolean isWord = false;
    	char[] result = new char[input.length()];
    	int resultIndex = 0;
    	
    	
    	if (input.charAt(0) != ' ') {
    		wordStartIndex = 0;
    		
    		isWord = true;
    	}
    	
    	for (int i = 1; i < input.length(); i++) {
    		if (input.charAt(i) == ' ') {
    			if (isWord) {
    				word = input.substring(wordStartIndex, i);
    				
    				System.out.println(word);
    				
    				word = transformWord(word, dictSet);
    				
    				for (int j = 0; j < word.length(); j++) {
    					result[resultIndex] = word.charAt(j);
    					
    					resultIndex++;
    				}
    			}
    			else if (input.charAt(i - 1) != ' ') {
    				result[resultIndex] = input.charAt(i - 1);
    				
    				resultIndex++;
    			}
    			
    			result[resultIndex] = ' ';
    			
    			resultIndex++;
    			
    			isWord = false;
    		}
    		else {
    			if (input.charAt(i - 1) != ' ') {
    				isWord = true;
    			}
    			
    			if (isWord == false) {
    				wordStartIndex = i;
    			}
    		}
    	}
    	
    	if (input.charAt(input.length() - 1) != ' ') {
    		word = input.substring(wordStartIndex);
    		
    		word = transformWord(word, dictSet);
    		
			for (int j = 0; j < word.length(); j++) {
				result[resultIndex] = word.charAt(j);
				
				resultIndex++;
			}
    	}
    	
    	result = Arrays.copyOfRange(result, 0, resultIndex);
    	
    	return result;
    }

}
