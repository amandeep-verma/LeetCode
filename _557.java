
public class _557 {
	class Solution {
	    
	    public void reverseString(char[] s) {
	        int end = s.length-1;
	        int start = 0;
	        while (start<end)
	        {
	            char temp = s[start];
	            s[start++] = s[end];
	            s[end--] = temp;
	        }
	    }
	    
	    public void reverseString(char[] s,int i, int j) {
	        int end = j;
	        int start = i;
	        while (start<end)
	        {
	            char temp = s[start];
	            s[start++] = s[end];
	            s[end--] = temp;
	        }
	    }
	    
	    public String reverseWords(String s) {
	        
	        //Solution3
	        
	        char[] rev = s.toCharArray();
	        int start = 0;
	        int end = s.indexOf(' ');
	        while(end>=0)
	        {
	            reverseString(rev,start,end-1);
	            start=end+1;
	            end=s.indexOf(' ',start);
	        }
	        reverseString(rev,start,s.length()-1);
	        
	        
	        return String.valueOf(rev);
	        
	        //Solution 2
//	         StringBuilder rev = new StringBuilder(s);
	        
//	         int start=0;
//	         int end = s.indexOf(' ');
//	         while(end > 0)
//	         {
//	             StringBuilder revpart = new StringBuilder(s.substring(start,end));
//	             revpart.reverse();
	            
//	             rev.replace(start,end,revpart.toString());
//	             start = end+1;
//	             end = s.indexOf(' ',start);
//	         }
//	         StringBuilder revpart = new StringBuilder(s.substring(start,s.length()));
//	         revpart.reverse();
//	         rev.replace(start,s.length(),revpart.toString());
//	         return rev.toString();
	        
	        
	        
	        
	        //Solution 1
//	         StringBuilder rev = new StringBuilder();
	        
//	         int start=0;
//	         int end = s.indexOf(' ');
//	         while(end > 0)
//	         {
//	             char[] arr = s.substring(start,end).toCharArray();
//	             reverseString(arr);
//	             rev.append(arr);
//	             rev.append(' ');
//	             start = end+1;
//	             end = s.indexOf(' ',start);
//	         }
//	         char[] arr = s.substring(start,s.length()).toCharArray();
//	         reverseString(arr);
//	         rev.append(arr);
	        
//	         return rev.toString();
	    }
	}
}
