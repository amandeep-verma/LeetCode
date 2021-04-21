
public class _1768 {
	class Solution {
	    public String mergeAlternately(String word1, String word2) {
	        
	        StringBuilder st = new StringBuilder();
	        int i=0;
	        int min = Math.min(word1.length(),word2.length());
	            
	        for(i=0; i<min; i++)
	        {
	            st.append(word1.charAt(i));
	            st.append(word2.charAt(i));
	        }
	        
	        if(i<word1.length())
	        {
	            st.append(word1.substring(i));
	        }
	        else
	        {
	            st.append(word2.substring(i));
	        }
	        
	        return st.toString();
	    }
	}
}
