

public abstract class Tester {

	public static void main(String[] args) {
		String fileName = args[0];
		WordListReader listReader = new WordListReader(fileName);
		WordFinder wordFinder = new WordFinder();
		
		listReader.importList();
//		
//		System.out.println(WordList.getWordListSize());
		
//		wordFinder.getInput("rdnleabbletoewas");
//		wordFinder.buildLetterOccurrence();
//		wordFinder.findWords();
//		wordFinder.printResult();
		
		UserInterface gui = new UserInterface();
	}

}
