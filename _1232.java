
public class _1232 {

	class Solution {
	    public boolean checkStraightLine(int[][] coordinates) {
			if(coordinates.length ==2)
				return true;

			// check for slope 
			float slope = (float)(coordinates[1][1]-coordinates[0][1]) / (float)(coordinates[1][0]-coordinates[0][0]);
	        if (slope == Float.NEGATIVE_INFINITY)   slope =Float.POSITIVE_INFINITY;
	        
			for(int i =2;i <coordinates.length ;i++)
			{
	            float newSlope = (float)(coordinates[i][1]-coordinates[i-1][1]) / (float)(coordinates[i][0]-coordinates[i-1][0]);
	            if (newSlope == Float.NEGATIVE_INFINITY)    newSlope =Float.POSITIVE_INFINITY;
	            
				if(slope != newSlope)   return false;
			}
			return true;
		}
	}
}
