
public class _344 {
	class Solution {
	    public void reverseString(char[] s) {
	        // Sol - 1
	        
	        // int lastindex= s.length-1;
	        // for(int i =0; i<s.length/2;i++)
	        // {
	        //     char temp = s[i];
	        //     s[i] = s[lastindex-i];
	        //     s[lastindex-i] = temp;
	        // }
	        
	        
	        // Sol - 2
	        int end = s.length-1;
	        int start = 0;
	        while (start<end)
	        {
	            char temp = s[start];
	            s[start++] = s[end];
	            s[end--] = temp;
	        }
	        
	    }
	}
}
