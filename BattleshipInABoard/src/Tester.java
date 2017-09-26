
public class Tester {

	public static void main(String[] args) {
//		int[] test = {1, 2, 3, 4};
//		
//		for (int i = 0; i < 10; i++) {
//			try {
//				System.out.println(test[i]);
//			}
//			catch (Exception e) {
//				System.out.println("Damn!");
//			}
//		}

		char[][] testMap = {
				{'x', '.', '.', 'x'},
				{'.', '.', '.', 'x'},
				{'.', 'x', '.', 'x'}
		};
		
		Battleship ob = new Battleship();
		
		int result = ob.countBattleships(testMap);
		
		System.out.println(result);
	}

}
