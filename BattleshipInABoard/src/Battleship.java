/* 
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 * 
 */
public class Battleship {
	char[][] map = null;
	
    public int countBattleships(char[][] board) {
    	int result = 0;
    	
    	this.map = board;
    	
    	for (int i = 0; i < map.length; i++) {
    		for (int j = 0; j < map[0].length; j++) {
    			if (map[i][j] == 'X') {
    				result++;
        			detectShip(i, j);
    			}
    		}
    	}
    	
        return result;
    }
    
    public void detectShip(int x, int y) {
    	try { //Up
    		if (map[x - 1][y] == 'X') {
    			map[x - 1][y] = '.';
    			detectShip(x - 1, y);
    		}
    		
    	}
    	catch (Exception e) {
    		
    	}
    	
    	try { //Down
    		if (map[x + 1][y] == 'X') {
    			map[x + 1][y] = '.';
    			detectShip(x + 1, y);
    		}
    		
    	}
    	catch (Exception e) {
    		
    	}
    	
    	try { //Left
    		if (map[x][y - 1] == 'X') {
    			map[x][y - 1] = '.';
    			detectShip(x, y - 1);
    		}
    		
    	}
    	catch (Exception e) {
    		
    	}
    	
    	try { //Right
    		if (map[x][y + 1] == 'X') {
    			map[x][y + 1] = '.';
    			detectShip(x, y + 1);
    		}
    		
    	}
    	catch (Exception e) {
    		
    	}
    	
    }
    
    
}
