
public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		
		node1.right = node3;
		node3.left = node2;
		
		MinimumDifferenceBST ob = new MinimumDifferenceBST();
		System.out.println(ob.getMinimumDifference(node1));

	}

}
