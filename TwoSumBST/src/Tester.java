
public class Tester {

	public static void main(String[] args) {
		TreeNode node5 = new TreeNode(5); //root
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node7 = new TreeNode(7);
		
		node5.left = node3;
		node5.right = node6;
		node3.left = node2;
		node3.right = node4;
		node6.right = node7;
		TwoSumBST ob = new TwoSumBST();
		System.out.println(ob.findTarget(node5, 9));
		TwoSumBSTImproved ob2 = new TwoSumBSTImproved();
		System.out.println(ob.findTarget(node5, 9));
	}

}
