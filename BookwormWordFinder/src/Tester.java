

public abstract class Tester {

	public static void main(String[] args) {
		String fileName = "data.txt";
		WordListReader listReader = new WordListReader(fileName);
		
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
