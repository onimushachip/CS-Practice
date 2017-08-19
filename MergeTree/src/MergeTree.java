
public class MergeTree {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//		System.out.println("check");
//		System.out.println(t1);
//		System.out.println(t2);
		TreeNode newNode = null;
		
		if (t1 == null && t2 == null) {
			return null;
		}
		
		TreeNode t1Left = null;
		TreeNode t1Right = null;
		TreeNode t2Left = null;
		TreeNode t2Right = null;
		
		
		int newValue = (t1 == null ? 0 : t1.value) + (t2 == null ? 0 : t2.value);
		
		if (t1 != null) {
			t1Left = t1.left;
			t1Right = t1.right;
		}
		
		if (t2 != null) {
			t2Left = t2.left;
			t2Right = t2.right;
		}
		
		newNode = new TreeNode(newValue);
		
		newNode.left = mergeTrees(t1Left, t2Left);
		newNode.right = mergeTrees(t1Right, t2Right);
		
		return newNode;
	}

}
