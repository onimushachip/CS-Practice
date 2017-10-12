import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node7 = new TreeNode(7);
		
		node5.left = node3;
		node5.right = node6;
		node3.left = node2;
		node3.right = node4;
		node6.right = node7;
		
		PrintBinaryTree ob = new PrintBinaryTree();
		
		List<List<String>> result = ob.printTree(node5);
	}

}
