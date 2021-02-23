
public class _1446 {
	class Solution {
	    public int maxPower(String s) {
	        
	        // Solution 2
	        int power =1;
	        char last = s.charAt(0);
	        int sum =1;
	        for(int i =1; i<s.length();i++ )
	        {
	            if(s.charAt(i)==last)
	                sum++;
	            else
	            {
	                if(power>= s.length()-i)
	                    break;
	                sum=1;
	                last = s.charAt(i);
	            }
	            if(sum>power)
	                power =sum;
	        }
	        return power;

	        
	        
	        // Solution 1 
//	         int power =1;
//	         for(int i =0; i<s.length()-1; )
//	         {
//	             char last = s.charAt(i);
//	             int j;
//	             for(j =i+1; j<s.length() && s.charAt(j)==last; j++)
//	             {}
//	             if(power<j-i)
//	                 power = j-i;
//	             i=j;
//	         }
//	         return power;
	        
	    }
	}
}
