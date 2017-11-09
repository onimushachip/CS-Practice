
public class Tester {

	public static void main(String[] args) {
		TreeNode node4 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node6 = new TreeNode(6);
		TreeNode node3 = new TreeNode(3);
		TreeNode node1 = new TreeNode(1);
		TreeNode node5 = new TreeNode(5);
		
		node4.left = node2;
		node4.right = node6;
		node2.left = node3;
		node2.right = node1;
		node6.left = node5;
		
		AddRowTree ob = new AddRowTree();
		
		TreeNode result = ob.addOneRow(node4, 1, 4);
		
		System.out.println(result.val + " " + result.left.left.val + " " + result.right.val);

	}

}
