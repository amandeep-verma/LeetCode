
public class _122 {
	class Solution {
	    public int maxProfit(int[] prices) {
	        
	        
	        int min = prices[0];
	        int last = prices[0];
	        int maxP =0;
	        for(int i =1; i<prices.length;i++)
	        {
	            if(prices[i]<last)
	            {
	                maxP=maxP+last-min;
	                min = prices[i];
	            }
	            last= prices[i];
	            
	            if(i == prices.length-1)
	            {
	                if(prices[i]>min)
	                    maxP = maxP +prices[i]-min;
	            }

	        }
	        
	        return maxP;
	    }
	}
}
