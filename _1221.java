
public class _1221 {
	class Solution {
	    public int balancedStringSplit(String s) {
	    	
	    	
	    	
	        int countL=0;
	        int countR=0;
	        int countSubString=0;
	        
	        for(int i =0; i<s.length(); i++)
	        {
	            if(s.charAt(i)=='L')
	                countL++;
	            else
	                countR++;
	            if(countL==countR)
	                countSubString++;
	        }
	        
	        return countSubString;
	    }
	}
}
