import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Read all words from a word-list file
 * WordList class dependent
 */


public class WordListReader {
	private String fileName;
	private String line;
	
	public WordListReader(String path) {
		this.fileName = path;
	}
	
	public void importList(){
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			line = bufferedReader.readLine();
			while (line != null) {
				line =  line.toLowerCase();
				WordList.addWord(line); //Store the word in WordList
				line = bufferedReader.readLine();
			}
			
			bufferedReader.close();
		}
		catch(FileNotFoundException exception) {
			System.out.println("No File!");
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}
	}

}
