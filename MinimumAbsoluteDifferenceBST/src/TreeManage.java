
public class TreeManage {
	private int previousValue = 999999;
	public void addNode(TreeNode tree, TreeNode newNode) {
		if (tree == null || newNode == null) {
			return;
		}
		
		//Left
		if (tree.val > newNode.val) {
			if (tree.left == null) {
				tree.left = newNode;
			}
			else {
				addNode(tree.left, newNode);
			}
		}
		
		//Right
		if (tree.val < newNode.val) {
			if (tree.right == null) {
				tree.right = newNode;
			}
			else {
				addNode(tree.right, newNode);
			}
		}
		System.out.println("check");
	}
	
	//In-order traverse
	public void printTree(TreeNode tree) {
		if (tree == null) {
			return;
		}
		
		if (tree.left != null) {
			printTree(tree.left);
		}
		
		System.out.println(tree.val + " " + this.previousValue);
		this.previousValue = tree.val;
		
		if (tree.right != null) {
			printTree(tree.right);
		}
	}

}
