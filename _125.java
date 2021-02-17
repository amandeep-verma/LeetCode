
public class _125 {
	class Solution {
	    
	    public boolean isAlphaNumeric(char c)
	    {
	        if( (c >=48 && c <= 57) ||(c >=65 && c <= 90)||(c >=97 && c <= 122) )
	            return true;
	        return false;
	    }
	    public boolean isPalindrome(String s) {
	        
	        int j = s.length()-1;
	        int i=0;
	        
	        while(i<j)
	        {
	            char startP = s.charAt(i);
	            char endP = s.charAt(j);
	            if( !isAlphaNumeric(startP) )
	            {
	                i++;
	                continue;
	            }
	            if( !isAlphaNumeric(endP) )
	            {
	                j--;
	                continue;
	            }
	            if (startP > 96 )
	                startP -=   32;
	            if (endP > 96 )
	                endP -=   32;
	            
	            if(startP!=endP)
	                return false;
	            i++;
	            j--;
	        }
	        
	        return true;
	    }
	}
}
