
public class _541 {

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

	    
	    public String reverseStr(String s, int k) {
	        
	        // Solution 3 - 
	        char[] array = s.toCharArray();
	        
	        for(int i =0; i< s.length(); i = i+2*k)
	        {
	            int maxrev = Math.min(i+k,s.length());
	            reverseString(array,i, maxrev-1);
	        }
	        
	        return String.valueOf(array);
	        
	        // Solution 2 - optimised
//	         StringBuilder ab = new StringBuilder();
//	         int i;
//	         for(i =0; i+2*k <= s.length(); )
//	         {
//	             char[] toBeRev = s.substring(i, i+k).toCharArray();
//	             reverseString(toBeRev);
//	             ab.append(toBeRev);
	            
//	             ab.append(s.substring(i+k,i+2*k));
//	             i=i+2*k;
//	         }
	        
//	         if(i<s.length())
//	         {
//	             char[] toBeRev = s.substring(i, Math.min(i+k,s.length())).toCharArray();
//	             reverseString(toBeRev);
//	             ab.append(toBeRev);
	            
//	             i = i+k;
//	             if(i<s.length())
//	             {
//	                 ab.append(s.substring(i,s.length()));
//	             }
//	         }
	        
//	         return ab.toString();

	        
	        // Solution 1
	        
//	         StringBuilder ab = new StringBuilder();
//	         for(int i =0; i< s.length(); )
//	         {
//	             for(int j=k-1; j>=0;j--)
//	             {
//	                 if(i+j<s.length())
//	                 {
//	                     ab.append(s.charAt(i+j));
//	                 }
//	             }
//	             i += k;
//	             for(int j=0;j<k; j++)
//	             {
//	                 if(i+j<s.length())
//	                 {
//	                     ab.append(s.charAt(i+j));
//	                 }
//	             }
//	             i += k;
//	         }
//	         return ab.toString();
	    }
	}
}
