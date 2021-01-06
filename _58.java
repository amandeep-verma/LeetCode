
public class _58 {
	class Solution {
	    public int lengthOfLastWord(String s) {
	        
	        // Solution 2 without trim, in case of very long string
	        int size=0;
	        int i;
	        for (i = s.length()-1 ; i >=0 ; i--)
	        {
	             if (s.charAt(i) != ' ')
	             {
	                 break;
	             }
	        }
	        
	        for ( ; i >=0 ; i--)
	        {
	            if(s.charAt(i)==' ')
	            {
	                break;
	            }
	            else
	            {
	                size++;
	            }
	        }
	        return size;
	        
	        // Solution 1 with trim
	        s=s.trim();
	        int lastIndex = s.lastIndexOf(' ');
	        return s.length()-lastIndex-1;
	        
	    }
	}
}
