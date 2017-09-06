

public abstract class Tester {

	public static void main(String[] args) {
		String fileName = args[0];
		WordListReader listReader = new WordListReader(fileName);
		
		listReader.importList();
		
		System.out.println(WordList.getWordListSize());
	}

}
