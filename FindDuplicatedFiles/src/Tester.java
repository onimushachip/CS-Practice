import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		String testRegex = "root/a  1.txt(abcd) 2.txt(efgh)";

		String[] result = testRegex.split("\\s+");
		
		System.out.println(testRegex);
		
		System.out.println(Arrays.toString(result));
		
		ArrayList<String> contentList = new ArrayList<>();
		
		for (int i = 1; i < result.length; i++) {
			String content;
			int indexContent = result[i].indexOf('(');
			
			content = result[i].substring(indexContent);
			
			contentList.add(content);
		}
		
		System.out.println(Arrays.asList(contentList));
		
		String[] test = new String[4];
		
		test[0] = "root/a 1.txt(abcd) 2.txt(efgh)";
		test[1] = "root/c 3.txt(abcd)";
		test[2] = "root/c/d 4.txt(efgh)";
		test[3] = "root 4.txt(efgh)";
		
		FindDuplicate ob = new FindDuplicate();
		
		ob.findDuplicate(test);
		
	}

}
