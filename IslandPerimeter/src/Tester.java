
public class Tester {

	public static void main(String[] args) {
//		int[][] test = {
//				{0, 1, 0, 0},
//				{1, 1, 1, 0},
//				{0, 1, 0, 0},
//				{1, 1, 0, 0}
//		};
		
		int[][] test = {
				{1, 0},
		};
		
		IslandPerimeter ob = new IslandPerimeter();
		System.out.println(ob.islandPerimeter(test));

	}

}
