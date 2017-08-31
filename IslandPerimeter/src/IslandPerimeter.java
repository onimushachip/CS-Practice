/*
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
 * Grid cells are connected horizontally/vertically (not diagonally). 
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). 
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
 * One cell is a square with side length 1. 
 * The grid is rectangular, width and height don't exceed 100. 
 * Determine the perimeter of the island.
 * 
 */
public class IslandPerimeter {
		private int[][] inputGrid;
		private int gridRow = 0;
		private int gridCol = 0;
		private int landX = 0;
		private int landY = 0;
		private int result = 0;
	
	    public int islandPerimeter(int[][] grid) {
	    	this.gridRow = grid.length;
	    	this.gridCol = grid[0].length;
	    	this.inputGrid = grid;
	    	
	    	findStartTile();
	    	findPerimeter(landX, landY);
	        
	    	return result;
	    }
	    
	    private void findStartTile() {
	    	//Find the first land tile
	    	for (int i = 0; i < gridRow; i++) {
	    		for (int j = 0; j < gridCol; j++) {
	    			if (inputGrid[i][j] == 1) {
	    				landX = i;
	    				landY = j;
	    				return;
	    			}
	    		}
	    	}
	    }
	    
	    private void findPerimeter(int y, int x) {
	    	inputGrid[y][x] = 2;
	    	
	    	if (x - 1 >= 0) {
		    	//left
		    	if (inputGrid[y][x - 1] == 1) {
		    		findPerimeter(y, x - 1);
		    	}
		    	else if (inputGrid[y][x - 1] == 0) {
		    		result++;
		    	}
	    	}
	    	else {
	    		result++;
	    	}
	    	
	    	if (x + 1 < gridCol) {
		    	//right
		    	if (inputGrid[y][x + 1] == 1) {
		    		findPerimeter(y, x + 1);
		    	}
		    	else if (inputGrid[y][x + 1] == 0) {
		    		result++;
		    	}
	    	}
	    	else {
	    		result++;
	    	}
	    	
	    	if (y - 1 >= 0) {
		    	//up
		    	if (inputGrid[y - 1][x] == 1) {
		    		findPerimeter(y - 1, x);
		    	}
		    	else if (inputGrid[y - 1][x] == 0) {
		    		result++;
		    	}
	    	}
	    	else {
	    		result++;
	    	}
	    	
	    	if (y + 1 < gridRow) {
		    	//down
		    	if (inputGrid[y + 1][x] == 1) {
		    		findPerimeter(y + 1, x);
		    	}
		    	else if (inputGrid[y + 1][x] == 0) {
		    		result++;
		    	}
	    	}
	    	else {
	    		result++;
	    	}
	    }

}
