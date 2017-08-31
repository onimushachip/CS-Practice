/*
 * For a web developer, it is very important to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
 * 1. The area of the rectangular web page you designed must equal to the given target area.
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 3. The difference between length L and width W should be as small as possible.
 * 
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
    	int length = area;
    	int width = 1;
    	int[] result = new int[2];
        
        if (area == 1) {
            return new int[]{1, 1};
        }
    	
    	while (true) {
    		if (area % width == 0) {
    			length = area / width;
    			if (width <= length) {
    				result[0] = length;
        			result[1] = width;
    			}
    			else {
    				break;
    			}
    		}
    		width++;
    	}
        return result;
    }

}
