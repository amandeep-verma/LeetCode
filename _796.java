
public class _796 {
	class Solution {
	    public boolean rotateString(String A, String B) {

	        
	        //Solution 1
	        if(A.length()!= B.length())
	            return false;
	        String C = B+B;
	        
	        if(C.indexOf(A)<0)
	            return false;
	        
	        return true;
	    }
	}
}
