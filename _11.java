
public class _11 {

	class Solution {
	    public int maxArea(int[] height) {
	        
	    	//solution 1
//	        int maxwater =0;
//	         for (int i=0 ; i < height.length-1 ; i++)
//	         {
//	             for (int j =i+1; j< height.length ; j++)
//	             {
//	                 int watervol = Math.min(height[i],height[j]) * (j-i);
//	                 if ( watervol> maxwater)
//	                 {
//	                     maxwater=watervol;
//	                 }
//	             }
//	         }
//	        return maxwater;
	        
	    	//solution 2
	        int maxwater =0;
	        int l = 0;
	        int r = height.length-1;
	        
	        while (r>l)
	        {
	            int current = height[l]> height[r] ? height[r] *(r-l) :height[l] *(r-l) ;
	            maxwater = maxwater> current ? maxwater :current;
	            if(height[l]> height[r] )
	            {
	                r--;
	            }
	            else
	            {
	                l++;
	            }
	            
	        }
	        return maxwater;
	    }
	}
	

	

}
