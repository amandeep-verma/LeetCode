
public class _1790 {
	class Solution {
	    public boolean areAlmostEqual(String s1, String s2) {
	        
	        int index1 = -1;
	        int index2 = -1;
	        int i;
	        for(i=0;i<s1.length();i++)
	        {
	            if(s1.charAt(i)!=s2.charAt(i))
	            {
	                index1=i;
	                break;
	            }
	        }
	        if(index1==-1)
	            return true;
	        for(++i;i<s1.length();i++)
	        {
	            if(s1.charAt(i)!=s2.charAt(i))
	            {
	                index2=i;
	                break;
	            }
	        }
	        if(index2==-1)
	        {
	            return false;
	        }
	        
	        
	        
	        if(!s1.substring(index2+1,s1.length()).equals(s2.substring(index2+1,s1.length())) ||
	s1.charAt(index1)!=s2.charAt(index2) ||
	s1.charAt(index2)!=s2.charAt(index1))
	        return false;
	        
	        return true;
	    }
	}
}
