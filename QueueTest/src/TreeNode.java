
public class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int inputValue) {
		this.value = inputValue;
	}
	
	public void setLeftNode(TreeNode input) {
		this.left = input;
	}
	
	public void setRightNode(TreeNode input) {
		this.right = input;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public TreeNode getLeftNode() {
		return this.left;
	}
	
	public TreeNode getRightNode() {
		return this.right;
	}
}
