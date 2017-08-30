
public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		node1.left = node2;
		node1.right = node3;
		node2.right = node4;
		
		TreeToString ob = new TreeToString();
		
		System.out.println(ob.tree2str(node1));
	}

}
