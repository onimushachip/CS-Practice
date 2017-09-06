import java.util.ArrayList;

/*
 * Storing imported words in a linked list
 * 
 */
public class WordList {
	private static ArrayList<String> wordList = new ArrayList<String>();
	
	public static void addWord(String newWord) {
		wordList.add(newWord);
	}
	
	public static String getWord(int index) {
		return wordList.get(index);
	}
	
	public static int getWordListSize() {
		return wordList.size();
	}
}
