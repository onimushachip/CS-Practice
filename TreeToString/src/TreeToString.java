/*
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 * The null node needs to be represented by empty parenthesis pair "()". 
 * And you need to omit all the empty parenthesis pairs that don't affect the one-to-one 
 * mapping relationship between the string and the original binary tree.
 * 
 */
public class TreeToString {
	private String result = "";
    public String tree2str(TreeNode t) {
    	traverseTree(t);
    	
    	return result;
    }
    
    private void traverseTree(TreeNode root) {
    	if (root == null) {
    		return;
    	}
    	
    	result += root.val;
    	
    	if (root.left == null && root.right != null) {
    		result += "()";
    		result += "(";
    		traverseTree(root.right);
    		result += ")";
    	}
    	else {
			if (root.left != null) {
				result += "(";
				traverseTree(root.left);
				result += ")";
			}
			if (root.right != null) {
				result += "(";
				traverseTree(root.right);
				result += ")";
			}
    	}

    } 
}
