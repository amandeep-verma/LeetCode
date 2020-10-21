
public class _633 {
	class Solution {
	    public boolean judgeSquareSum(int c) {
	        
	        
	        //Solution 2 // 2 pointer method
	        
	        int l=0; 
	        int r = (int)(Math.sqrt(c));
	        
	        while(l<=r)
	        {
	            int sum = l*l+r*r;
	            if (sum ==c)
	                return true;
	            else if (sum > c)
	                r--;
	            else
	                l++;
	        }
	        return false;
	        
	        // Solution 1
	        // find ceiling of closest under root of c
	        // this is max a number can be possible with
//	         int a = (int)(Math.sqrt(c));
//	         if( a*a == c)
//	             return true;
	        
//	         for(int i =1; i<= a; i++)
//	         {
//	             int bsq = c - i*i;
//	             int b =  (int)(Math.sqrt(bsq));
	            
//	             if(b*b ==bsq)
//	                 return true;
//	         }
//	         return false;
	        
	    }
	}
}
