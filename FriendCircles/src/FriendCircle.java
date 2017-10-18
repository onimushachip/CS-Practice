/*
 * There are N students in a class. Some of them are friends, while some are not. 
 * Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. 
 * And we defined a friend circle is a group of students who are direct or indirect friends.
 * Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, 
 * then the ith and jth students are direct friends with each other, otherwise not. 
 * And you have to output the total number of friend circles among all the students.
 * 
 */
public class FriendCircle {
    public int findCircleNum(int[][] M) {
    	
//    	int col = 0;
    	
    	for (int friend = 0; friend < M.length; friend++) {
    		
    		for (int col = friend - 1; col >= 0; col--) {
    			System.out.print(M[friend][col] + " ");
    		}
    		System.out.print(" + ");
    		for (int row = friend + 1; row < M.length; row++) {
    			System.out.print(M[row][friend] + " ");
    		}
    		System.out.print("\n");
    	}
        
    	return 0;
    }
}
