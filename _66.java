
public class _66 {
	class Solution {
	    public int[] plusOne(int[] digits) {
	        
	        
	        
	        for( int i = digits.length-1; i>=0; i--)
	        {
	            if(digits[i] != 9)
	            {
	                digits[i]+=1;
	                return digits;
	            }
	            digits[i] = 0;
	        }
	        
	        int[] retdigits = new int[digits.length+1];
	        retdigits[0]=1;
	        return retdigits;
	    }
	}
}
