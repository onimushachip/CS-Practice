
public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		TreeNode node11 = new TreeNode(11);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node4.left = node6;
		node6.right = node8;
		node8.left = node10;
		node5.right = node7;
		node7.left = node9;
		node9.right = node11;
		
		DiameterTree ob = new DiameterTree();
		int testDia = ob.diameterOfBinaryTree(node1);
		System.out.println("Diameter: " + testDia);
	}

}
