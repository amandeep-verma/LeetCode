
public class _680 {

	class Solution {
	    
	    public int[] isPalindrome(String s,int i, int j) {
	        while(i<j)
	        {
	            if(s.charAt(i)!=s.charAt(j))
	            {
	                return new int[]{i,j};
	            }
	            i++;
	            j--;
	        }
	        return new int[]{i,j};
	    }
	    public boolean validPalindrome(String s) {
	        int[] value = isPalindrome(s,0,s.length()-1);
	        int i = value[0],j=value[1];
	        if(i>=j)
	            return true;
	        
	        int[] svalue={i,j};
	        if(s.charAt(i+1)==s.charAt(j))
	            svalue = isPalindrome(s,i+2,j-1);
	        if(svalue[0]>=svalue[1])
	            return true;
	        
	        if(s.charAt(i)==s.charAt(j-1))
	            svalue = isPalindrome(s,i+1,j-2);
	        if(svalue[0]>=svalue[1])
	            return true;
	        
	        
	        return false;

	    }
	}
}
