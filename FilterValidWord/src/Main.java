import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String inputFile = "input.txt";
		String outputFile = "output.txt";
		String line = "";

		try {
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			FileWriter fileWriter = new FileWriter(outputFile);
			BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
			
			line = bufferedReader.readLine();
			while (line != null) {
				char[] lineChar = line.toCharArray();
				if (checkLine(lineChar)) {
					bufferedWriter.write(line + "\n");
				}
				line = bufferedReader.readLine();
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkLine(char[] input) {
		for (int i = 0; i < input.length; i++) {
			if (Character.isUpperCase(input[i]) || input[i] == '-') {
				return false;
			}
		}
		return true;
	}

}
