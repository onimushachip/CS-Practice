
public class Tester {

	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		node3.left = node9;
		node3.right = node20;
		node20.left = node15;
		node20.right = node7;
		
		MaximumDepthBinaryTree ob = new MaximumDepthBinaryTree();
		int result = ob.maxDepth(node3);
		System.out.println(result);

	}

}
