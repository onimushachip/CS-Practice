/*
 * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings. 
 * The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence 
 * should not be any subsequence of the other strings.
 * A subsequence is a sequence that can be derived from one sequence by deleting 
 * some characters without changing the order of the remaining elements. 
 * Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
 * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence. 
 * If the longest uncommon subsequence doesn't exist, return -1.
 * 
 */


public class LongestUncommonSubsequence {
    public int findLUSlength(String a, String b) {
    	int longestLength;
    	int shortestLength;
    	int LUSLengthHead;
    	int LUSLengthTail;
    	char[] arrayA = a.toCharArray();
    	char[] arrayB = b.toCharArray();
    	
    	if (a.length() > b.length()) {
    		longestLength = a.length();
    		shortestLength = b.length();
    	}
    	else {
    		longestLength = b.length();
    		shortestLength = a.length();
    	}
    	
    	
    	LUSLengthHead = longestLength;
    	LUSLengthTail = longestLength;

    	//Head to tail
    	int i = 0;
    	int j = 0;
    	
    	while (i < shortestLength || j < shortestLength) {
    		if (arrayA[i] == arrayB[i]) {
    			LUSLengthHead--;
    		}
    		else {
    			break;
    		}
    		i++;
    		j++;
    	}
    	
    	//Tail to head
    	i = a.length() - 1;
    	j = b.length() - 1;
    	while (i >= 0 && j >= 0) {
    		if (arrayA[i] == arrayB[j]) {
    			LUSLengthTail--;
    		}
    		else {
    			break;
    		}
    		
    		i--;
    		j--;
    	}
    	
    	if (LUSLengthHead == 0) {
    		return -1;
    	}
    	
    	if (LUSLengthHead > LUSLengthTail) {
    		return LUSLengthHead;
    	}
    	else {
    		return LUSLengthTail;
    	}
    	
    }
}
