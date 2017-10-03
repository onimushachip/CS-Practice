
public class Tester {

	public static void main(String[] args) {
		TreeNode node5 = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node1 = new TreeNode(1);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node5.left = node2;
		node5.right = node3;
		node2.left = node1;
		node2.right = node4;
		node3.left = node6;
		node3.right = node7;
		
		FrequentSubtreeSum ob = new FrequentSubtreeSum();
		
		ob.findFrequentTreeSum(node5);
	}

}
