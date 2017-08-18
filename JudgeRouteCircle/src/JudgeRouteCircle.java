//Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, 
//which means it moves back to the original place.
//The move sequence is represented by a string. And each move is represent by a character. 
//The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
//The output should be true or false representing whether the robot makes a circle.


public class JudgeRouteCircle {

	
	public boolean judgeCircle(String inputMove) {
		int posX = 0;
		int posY = 0;
		for (int i = 0; i < inputMove.length(); i++) {
			if (inputMove.charAt(i) == 'R') {
				posX++;
			}
			else if (inputMove.charAt(i) == 'L') {
				posX--;
			}
			else if (inputMove.charAt(i) == 'D') {
				posY--;
			}
			else if (inputMove.charAt(i) == 'U') {
				posY++;
			}
		}
		if (posX == 0 && posY == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
