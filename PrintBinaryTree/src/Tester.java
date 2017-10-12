
public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;
		node3.left = node4;
		
		PrintBinaryTree ob = new PrintBinaryTree();
		
		ob.printTree(node1);

	}

}
