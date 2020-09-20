
public class _896 {

	class Solution {
	    public boolean isMonotonic(int[] A) {
	        
	        if(A.length <2)
	            return true;
	        
	        // find 1st two elements which arent equal
	        int firstEl = A[0];
	        int secondEl = A[1];
	        
	        int i=1;
	        
	        if(firstEl==secondEl)
	        {
	            for( i=2; i <A.length;i++)
	            {
	                if(A[i-1]!=A[i])
	                {
	                    break;
	                }
	            }
	        }
	        
	        if(i==A.length)
	            return true;
	        
	        firstEl = A[i-1];
	        secondEl = A[i];
	        
	        // compare them to check for either of monotone increasing or decreasing
	        
	        //increasing
	        if(secondEl>firstEl)
	        {
	            for (int j=i+1 ; j<A.length; j++)
	            {
	                if(A[j]<A[j-1])
	                    return false;
	            }
	        }
	        //decreasing
	        else
	        {
	            for (int j=i+1 ; j<A.length; j++)
	            {
	                if(A[j]>A[j-1])
	                    return false;
	            }
	        }
	        
	        return true;
	    }
	}
}
