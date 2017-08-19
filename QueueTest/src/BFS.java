import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {

	public static void main(String[] args) {
//		Queue<Integer> testQ = new LinkedList<>();
//		int[] inputArray = {1, 2, 3, 4, 5};
//		for (int i = inputArray.length - 1; i >= 0; i--) {
//			testQ.add(inputArray[i]);
//		}
//		
//		System.out.println(Arrays.toString(inputArray));
//		
//		while (!testQ.isEmpty()) {
//			System.out.print(testQ.poll() + " ");
//		}
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node5 = new TreeNode(5);
		
		node1.setLeftNode(node3);
		node1.setRightNode(node2);
		node3.setLeftNode(node5);
		
//		System.out.println(node5.getLeftNode());
		
		//Start the BFS traverse function here
		
		Queue<TreeNode> allNode = new LinkedList<>();
		Queue<TreeNode> adjacentNode = new LinkedList<>();
		
		allNode.add(node1);
		adjacentNode.add(node1.getLeftNode());
		adjacentNode.add(node1.getRightNode());
		
		while (!adjacentNode.isEmpty()) {
			allNode.add(adjacentNode.peek());
			if (adjacentNode.peek() != null) {
				adjacentNode.add(adjacentNode.peek().getLeftNode());
				adjacentNode.add(adjacentNode.peek().getRightNode());
			}
			adjacentNode.remove();
		}
		
		while (!allNode.isEmpty()) {
			if (allNode.peek() != null) {
				System.out.println(allNode.poll().getValue());
			}
			else {
				System.out.println(allNode.poll());
			}
		}

	}

}
