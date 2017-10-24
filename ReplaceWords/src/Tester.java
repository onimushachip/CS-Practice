import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		String test = "a aa a aaaa";
		ReplaceWord ob = new ReplaceWord();
		
		ArrayList<String> dict = new ArrayList<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		
		System.out.println(ob.replaceWords(dict, test));
	}

}
