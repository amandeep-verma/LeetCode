
public class _69 {
	class Solution {
	    public int mySqrt(int x) {
	        
	        
	        // Solution 3
	        if(x >= 2147395600)
	            return 46340;
	        
	        int l = 0; 
	        int r= 46340;
	        while(l<r)
	        {
	            int m = (l+r)/2;
	            if (m*m <= x && (m+1)*(m+1)>x )
	                return m;
	            else if(m*m <x)
	                l=m+1;
	            else
	                r=m;
	        }
	         return r;
	        
	        // Solution 2
//	         if(x >= 2147395600)
//	             return 46340;
//	         if(x==1)
//	             return 1;
	        
//	         int i=0;
//	         for(i = 0; i<x/2 && i< 46340;i++)
//	         {
//	             if(i*i==x)
//	             {
//	                 break;
//	             }
//	             else if( (i+1)*(i+1) > x)
//	             {
//	                 break;
//	             }
//	         }
//	        return i;
	        
	        // Solution 1
	       //  return (int)Math.floor(Math.sqrt(x));
	    }
	}
}
