import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		TreeNode node4 = new TreeNode(4);
		TreeNode node9 = new TreeNode(9);
		
		node1.left = node3;
		node1.right = node2;
		node3.left = node5;
		node3.right = node4;
		node2.right = node9;
		
		FindLargestValue ob = new FindLargestValue();
		
		System.out.println(Arrays.asList(ob.largestValues(node1)));
	}

}
