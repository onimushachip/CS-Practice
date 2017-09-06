import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
 * Given a String with allowed letters
 * Find words that can be constructed from Word List
 * Word List dependent
 */
public class WordFinder {
	private String inputLetters;
	private Map<Integer, Integer> letterOccurrence = new HashMap<Integer, Integer>();
	private Map<Integer, Integer> lOTemp = new HashMap<Integer, Integer>();
	private Queue<String> resultList = new LinkedList<String>();
	private int maxLength = 0;
	
	public void getInput(String input) {
		this.inputLetters = input;
	}
	
	public void buildLetterOccurrence() {
		for (int i = 0; i < inputLetters.length(); i++) {
			int letterKey = inputLetters.codePointAt(i);
			if (letterOccurrence.containsKey(letterKey)) {
				letterOccurrence.put(letterKey, letterOccurrence.get(letterKey) + 1);
			}
			else {
				letterOccurrence.put(letterKey, 1);
			}
		}
		
//		System.out.println(Arrays.asList(this.letterOccurrence));
	}
	
	public void findWords() {
		buildLetterOccurrence();
		int wordListSize = WordList.getWordListSize();
		for (int i = 0; i < wordListSize; i++) {
//			System.out.println(WordList.getWord(i));
			String validWord = WordList.getWord(i);
			lOTemp = new HashMap<Integer, Integer>(letterOccurrence); //Create a temp copy of input letters
			if (checkWord(i, validWord) && validWord.length() > maxLength) {
				maxLength = validWord.length();
				resultList.add(WordList.getWord(i));
			}
			if (resultList.size() > 5) {
				resultList.poll();
			}
		}
	}
	
	public boolean checkWord(int index, String validWord) {
		for (int j = 0; j < validWord.length(); j++) {
			int charKey = validWord.codePointAt(j);
			if (lOTemp.containsKey(charKey)) {
				lOTemp.put(charKey, lOTemp.get(charKey) - 1);
				if (lOTemp.get(charKey) < 0) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public void printResult() {
		System.out.println(Arrays.asList(resultList));
	}
	
	
}
