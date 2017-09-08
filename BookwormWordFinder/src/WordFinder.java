import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

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
	private Stack<String> resultListReversed = new Stack<String>();
	private int maxLength = 0;
	
	public void getInput(String input) {
		clearData();
		this.inputLetters = input;
	}
	
	public void clearData() {
		this.inputLetters = null;
		this.letterOccurrence = new HashMap<Integer, Integer>();
		this.lOTemp = new HashMap<Integer, Integer>();
		this.resultList = new LinkedList<String>();
		this.resultListReversed = new Stack<String>();
		this.maxLength = 0;
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
	}
	
	public void findWords() {
		resultList = new LinkedList<String>();
		buildLetterOccurrence();
		int wordListSize = WordList.getWordListSize();
		for (int i = 0; i < wordListSize; i++) {
			String validWord = WordList.getWord(i);
			lOTemp = new HashMap<Integer, Integer>(letterOccurrence); //Create a temp copy of input letters
			if (checkWord(validWord) && validWord.length() >= maxLength) {
				maxLength = validWord.length();
				resultList.add(WordList.getWord(i));
			}
			if (resultList.size() > 10) {
				resultList.poll();
			}
		}
		int qSize = resultList.size();
		for (int i = 0; i < qSize; i++) {
			resultListReversed.add(resultList.poll());
		}
	}
	
	public boolean checkWord(String validWord) {
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
	
	public String getResultWord() {
		return resultListReversed.pop();
	}
	
	public int getResultListSize() {
		return resultListReversed.size();
	}
	
	public void printResult() {
		int qSize = resultList.size();
		for (int i = 0; i < qSize; i++) {
			System.out.println(resultList.poll());
		}
	}
	
	
}
