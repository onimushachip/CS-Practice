
public class Tester {

	public static void main(String[] args) {
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node13 = new TreeNode(13);

		node5.left = node2;
		node5.right = node13;
		
		ConvertTree ob = new ConvertTree();
		ConvertBST ob2 = new ConvertBST();
		
		ob2.traverseTree(ob2.convertBST(node5));
	}

}
