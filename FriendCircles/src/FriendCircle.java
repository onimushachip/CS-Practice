import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
    	ArrayList<Set> groupList = new ArrayList<Set>();
//    	int col = 0;
    	
    	for (int friend = 0; friend < M.length; friend++) {
    		Set<Integer> friendGroup = new HashSet<Integer>();
    		boolean isNewGroup = true;
    		int groupIndex = 0;
    		
//    		for (int i = 0; i < groupList.size(); i++) {
//    			if (groupList.get(i).contains(friend)) {
//    				friendGroup = groupList.get(i); //Check if the friend already belongs to a group
//    				
//    				isNewGroup = false;
//    				
//    				groupIndex = i;
//    			}
//    		}
    		
    		friendGroup.add(friend);
    		
    		for (int col = friend - 1; col >= 0; col--) { //Scan to the left
//    			System.out.print(M[friend][col] + " ");
    			if (M[friend][col] == 1) {
    				friendGroup.add(col);
    				
//    				for (int i = 0; i < groupList.size(); i++) {
//    					if (groupList.get(i).contains(col)) {
//    						isNewGroup = false;
//    						
//    						for (Integer newFriend : friendGroup) {
//    							groupList.get(i).add(newFriend);
//    						}
//    						
//    						friendGroup = groupList.get(i);
//    						
//    						groupList.remove(groupIndex);
//    					}
//    				}
    			}
    		}
//    		System.out.print(" + ");
    		for (int row = friend + 1; row < M.length; row++) { //Scan below
//    			System.out.print(M[row][friend] + " ");
    			if (M[row][friend] == 1) {
    				friendGroup.add(row);
    				
//    				for (int i = 0; i < groupList.size(); i++) {
//    					if (groupList.get(i).contains(row)) {
//    						isNewGroup = false;
//    						
//    						for (Integer newFriend : friendGroup) {
//    							groupList.get(i).add(newFriend);
//    						}
//    						
//    						friendGroup = groupList.get(i);
//    						
//    						groupList.remove(groupIndex);
//    					}
//    				}
    			}
    		}
//    		System.out.print("\n");
    		
    		for (Integer newFriend : friendGroup) {
    			for (int i = 0; i < groupList.size(); i++) {
    				if (groupList.get(i).contains(newFriend)) {
    					if (isNewGroup == true) {
        					isNewGroup = false;
        					
        					groupList.get(i).addAll(friendGroup);
        					
        					friendGroup = groupList.get(i);
        					
        					groupIndex = i;
    					}
    					else {
    						groupList.get(i).addAll(friendGroup);
    						
    						friendGroup = groupList.get(i);
    						
    						if (groupList.size() > 1) {
    							groupList.remove(groupIndex);
    						}
    						
    						groupIndex = i;
    					}
    				}
    			}
    		}
    		
    		if (isNewGroup) {
    			groupList.add(friendGroup);
    		}
    	}
        
    	return groupList.size();
    }
}
