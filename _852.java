
public class _852 {

	class Solution {
	    public int peakIndexInMountainArray(int[] A) {
	        
	        int i;
	        for ( i = 1; i < A.length ;i++)
	        {
	            if (A[i-1]>A[i])
	            {
	                return i-1;
	            }
	        }
	        return i;
	    }
	}
}
