
public class _205 {
	class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        
	        char[] sA = new char[128];
	        char[] tA = new char[128];
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(sA[s.charAt(i)]==0)
	                sA[s.charAt(i)]= t.charAt(i);
	            else if (sA[s.charAt(i)] != t.charAt(i))
	            {
	                return false;
	            }   
	        }
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(tA[t.charAt(i)]==0)
	                tA[t.charAt(i)]= s.charAt(i);
	            else if (tA[t.charAt(i)] != s.charAt(i))
	            {
	                return false;
	            }   
	        }
	        
	        return true;
	    }
	}
}
