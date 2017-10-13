import java.util.HashSet;
import java.util.Set;

/*
 * Implement a magic directory with buildDict, and search methods.
 * For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.
 * For the method search, you'll be given a word, and judge whether if you modify exactly one character into 
 * another character in this word, the modified word is in the dictionary you just built.
 * 
 */
public class MagicDictionary {
    private Set<String> dictionary;
	
    public MagicDictionary() {
        this.dictionary = new HashSet<String>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (int i = 0; i < dict.length; i++) {
        	dictionary.add(dict[i]);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
    	for (String dictWord : this.dictionary) {
    		if (checkWord(word, dictWord)) {
    			return true;
    		}
    	}
    	
        return false;
    }
    
    private boolean checkWord(String givenWord, String dictWord) {
    	if (givenWord.length() != dictWord.length()) {
    		return false;
    	}
    	
    	int neededChars = 0;
    	
    	for (int i = 0; i < givenWord.length(); i++) {
    		if (givenWord.charAt(i) == dictWord.charAt(i)) {
    			neededChars++;
    		}
    	}
    	
    	if (neededChars == (givenWord.length() - 1)) {
    		return true;
    	}
    	
    	return false;
    }

}
