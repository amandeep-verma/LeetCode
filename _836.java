
public class _836 {
	class Solution {
	    

	    
	    public boolean isRectangleOverlap(int[] rect1, int[] rect2) {
	        
	        // sol-1 
	        // check of either of them have area =0
	        if(rect1[2]-rect1[0]==0 || rect1[3]-rect1[1]==0 || rect2[2]-rect2[0]==0 || rect2[3]-rect2[1]==0)
	            return false;
	        
	        // check if second rectangle is either on left or right or top or bottom of the first triangle
	        if( rect1[1]>=rect2[3] || rect1[3]<=rect2[1] || rect1[0]>=rect2[2] || rect1[2]<=rect2[0])
	            return false;
	        
	        
	        return true;
	        
	    }
	}
}
