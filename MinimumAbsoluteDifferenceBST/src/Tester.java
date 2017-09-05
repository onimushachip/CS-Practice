
public class Tester {

	public static void main(String[] args) {
//		TreeNode node1 = new TreeNode(1);
//		TreeNode node3 = new TreeNode(3);
//		TreeNode node2 = new TreeNode(2);
//		
//		node1.right = node3;
//		node3.left = node2;
//		
//		MinimumDifferenceBST ob = new MinimumDifferenceBST();
//		System.out.println(ob.getMinimumDifference(node1));
		
		TreeNode node8 = new TreeNode(8);
		TreeNode node3 = new TreeNode(3);
		TreeNode node10 = new TreeNode(10);
		TreeNode node1 = new TreeNode(1);
		TreeNode node6 = new TreeNode(6);
		TreeNode node14 = new TreeNode(14);
		TreeNode node4 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		TreeNode node13 = new TreeNode(13);
		
		TreeManage ob = new TreeManage();
		ob.addNode(node8, node3);
		ob.addNode(node8, node10);
		ob.addNode(node8, node1);
		ob.addNode(node8, node6);
		ob.addNode(node8, node14);
		ob.addNode(node8, node4);
		ob.addNode(node8, node7);
		ob.addNode(node8, node13);
		
		ob.printTree(node8);

	}

}
