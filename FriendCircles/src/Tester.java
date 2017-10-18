
public class Tester {

	public static void main(String[] args) {
		int[][] test = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
		};
		
		
		FriendCircle ob = new FriendCircle();
		
		int result = ob.findCircleNum(test);
	}

}
