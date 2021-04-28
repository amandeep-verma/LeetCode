
public class _231 {
	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        
	        // Integer limitation
	        return n>0 && 1073741824 % n == 0;
	        
	        // Brute Force
	        if(n<1)
	            return false;
	        else if(n==1)
	            return true;
	        
	        int check = 1;
	        for( int i =1 ; i<32 ; i++)
	        {
	            check = check*2;
	            if(check ==n)
	                return true;
	        }
	        return false;
	    }
	}
}
