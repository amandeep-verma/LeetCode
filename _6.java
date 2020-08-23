
public class _6 {

	class Solution {
	    public String convert(String s, int numRows) {
	        
	        if (numRows==1)
	            return s;
	        
	        StringBuilder ret = new StringBuilder();
	        
	        for (int k = 0; k < s.length(); k += (2* numRows -2))
	            ret.append(s.charAt(k));
	        
	        for (int i = 1; i < numRows-1; i++)
	        {
	            boolean inBetween = false;
	             for (int k = 0;i+ k < s.length(); )
	            {
	                ret.append(s.charAt(i+k));
	                if (!inBetween)
	                    k += (2* (numRows - i) -2);
	                else
	                    k += (2* i);
	                inBetween = !inBetween;
	            }
	        }
	        
	        for (int k = numRows-1; k < s.length(); k += (2* numRows -2))
	            ret.append(s.charAt(k));
	            
	        return ret.toString();
	    }
	}
	


}
