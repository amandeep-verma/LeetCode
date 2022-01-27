
public class _171 {
	class Solution {
	    public int titleToNumber(String columnTitle) {
	        
	        // Solution 2
	        
	        int colT = 0;
	        
	        for(int i = columnTitle.length() -1 ; i>=0; i--)
	        {
	            colT += (columnTitle.charAt(i)-64) * Math.pow(26, columnTitle.length() -i -1) ;
	        }
	        return colT;
	        
	        // Solution 1
//	         int power = 26;
//	         int multilpier = 1;
	        
//	         int colT = 0;
	        
//	         for(int i = columnTitle.length() -1 ; i>=0; i--)
//	         {
//	             colT += (columnTitle.charAt(i)-64) * multilpier;
//	             multilpier *= power;
//	         }
//	         return colT;
	        
	    }
	}
}
