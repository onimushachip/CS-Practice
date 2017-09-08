
public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		
		node1.left = node2;
		node1.right = node3;

		BinaryTreeTilt ob = new BinaryTreeTilt();
		int result = ob.findTilt(node1);
		System.out.println(result + "--");
	}

}
