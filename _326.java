
public class _326 {
	class Solution {
	    
	    
	    
	    public boolean isPowerOfThree(int n) {

	        // The last solution in Solutions
	        return n>0 && 1162261467 % n == 0;
	        
	        
	         // Store all possible values in array
	        int[] power = {1,3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
	        
	        if(Arrays.binarySearch(power,n)>=0)
	            return true;

//	         return false;
	        
	        // brute force - 3^20 is max integer which int can hold
	        if( n<1)
	            return false;
	        
	        int check =1;
	        for(int i=0 ; i<22 ;i++)
	        {
	            if (check == n)
	                return true;
	            check = check *3;
	        }
	        return false;
	        
	    }
	}
}
