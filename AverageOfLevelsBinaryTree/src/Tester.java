import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(2147483647);
		TreeNode node20 = new TreeNode(2147483647);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		node3.left = node9;
		node3.right = node20;
		node20.left = node15;
		node20.right = node7;
		
		AverageLevel ob = new AverageLevel();
		List<Double> result = ob.averageOfLevels(node3);
//		double test = (double)5 / (double)2;
//		System.out.println(test);
		System.out.println(Arrays.asList(result));
		System.out.println(Arrays.asList(ob.averageOfLevelsQueue(node3)));
	}

}
