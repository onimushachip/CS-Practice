import java.util.List;

public class ReplaceWordTrie {
	 private TrieNode buildTrie(List<String> dict) {
			TrieNode root = new TrieNode(' ');
			
			for (String word : dict) {
			    TrieNode temp = root;
			    
			    for (char c : word.toCharArray()) {
			        if (temp.children[c - 'a'] == null) {
			            temp.children[c - 'a'] = new TrieNode(c);
			        }
			        
			        temp = temp.children[c - 'a'];
			    }
			    
			    temp.isWord = true;
			}
			
			return root;
	 }
}
