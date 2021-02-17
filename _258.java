
public class _258 {
	class Solution {
	    public int addDigits(int num) {
	        
	        
	        //Solution 1: recursion
	        if (num%10==num)
	            return num;
	        
	        int sum =0;
	        while(num>0)
	        {
	            sum = sum + num%10;
	            num=num/10;
	        }
	        return addDigits(sum);
	    }
	}
