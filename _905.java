
public class _905 {

	class Solution {
	    public int[] sortArrayByParity(int[] A) {
	        
	     // bubble up approach, in-place 
	        int start = 0;
	        for ( int i =0 ; i < A.length ; i++)
	        {
	            if( A[i]%2 ==0 )
	            {
	                int temp = A[i];
	                A[i] = A[start];
	                A[start] = temp;
	                start++;
	            }
	        }
	        return A;
	    }
	}
}
