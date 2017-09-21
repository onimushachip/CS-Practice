/*
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * You need to return whether the student could be rewarded according to his attendance record.
 * 
 */
public class AttendanceRecord {
    public boolean checkRecord(String s) {
    	int absenceCounter = 0;
    	int lateCounter = 1;
    	boolean continueLate = false;
        
    	for (int i = 0; i < s.length(); i++) {
//    		System.out.println("lateCounter: " + lateCounter + " " + i + " " + continueLate);
    		if (s.charAt(i) == 'A') {
    			absenceCounter++;
    			if (absenceCounter > 1) {
    				return false;
    			}
    		}
    		if (s.charAt(i) == 'L') {
    			if (continueLate == true) {
    				lateCounter++;
    				if (lateCounter > 2) {
    					return false;
    				}
    			}
    			continueLate = true;	
    		}
    		else {
    			continueLate = false;
    			lateCounter = 1;
    		}
    		
    	}
    	
    	return true;
    }

}
