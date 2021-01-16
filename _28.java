
public class _28 {

	class Solution {
	    public int strStr(String haystack, String needle) {
	        
	        
	        // Solution2 
	        if (needle.length()==0)
	            return 0;
	        
	        for( int i =0 ; i< haystack.length();i++)
	        {
	            int temp = i;
	            if(haystack.length() - i < needle.length())
	                    return -1;
	            
	            for(int j =0; j< needle.length(); j++)
	            {
	                if(haystack.charAt(i)==needle.charAt(j))
	                {
	                    if (j == needle.length()-1)
	                        return i-j;
	                    else
	                        i++;
	                }
	                else
	                {
	                    j=0;
	                    break;
	                }
	            }
	            i = temp;
	        }
	        
	        return -1;
	        
	        // Solution1 assuming indexOf is not allowed
	            
//	         return haystack.indexOf(needle);
	        
	        
	    }
	}
}
