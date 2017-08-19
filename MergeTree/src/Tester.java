
public class Tester {

	public static void main(String[] args) {
		TreeNode a1 = new TreeNode(1);
		TreeNode a3 = new TreeNode(3);
		TreeNode a2 = new TreeNode(2);
		TreeNode a5 = new TreeNode(5);
		
		a1.left = a3;
		a1.right = a2;
		a3.left = a5;
		
		TreeNode b2 = new TreeNode(2);
		TreeNode b1 = new TreeNode(1);
		TreeNode b3 = new TreeNode(3);
		TreeNode b4 = new TreeNode(4);
		TreeNode b7 = new TreeNode(7);
		
		b2.left = b1;
		b2.right = b3;
		b1.right = b4;
		b3.right = b7;
		
		MergeTree ob = new MergeTree();
		TreeNode newTree = ob.mergeTrees(a1, b2);
		
		System.out.println(newTree.value);
		System.out.println(newTree.left.value + " " + newTree.right.value);
//		System.out.println(newTree.right.value);
		System.out.println(newTree.left.left.value + " " + newTree.left.right.value);
		System.out.println(newTree.right.left + " " + newTree.right.right.value);
		
		
		
	}

}
