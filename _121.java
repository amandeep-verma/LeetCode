
public class _121 {

	class Solution {
	    
	    
	    public int maxProfit(int[] prices) {
	        
	        // Solution2 : recursive calls to keep next min and next max where maxIndex>minIndex
	        
	        int min = prices[0];
	        int maxP =0;
	        for(int i =1; i<prices.length;i++)
	        {
	            if(prices[i]<min)
	                min = prices[i];
	            else if(maxP<prices[i]-min)
	                maxP = prices[i]-min;
	        }
	        
	        return maxP;
	        
	        
	        // Solution1 : Brute Force imrovised with conditions
	        // keeping the selling price fix to berak the loop earlier
//	         boolean decendingFlag = true;
//	         for(int i=1; i<prices.length;i++)
//	         {
//	             if(prices[i-1]<prices[i])
//	                 decendingFlag=false;
//	         }
//	         if(decendingFlag)
//	             return 0;
	        
//	         int maxP=0;
//	         for(int i=prices.length-1; i>0;i--)
//	         {
//	             if(maxP>=prices[i])
//	                 continue;
//	             for(int j= i-1;j>=0;j--)
//	             {
//	                 if(prices[i]-prices[j]>maxP)
//	                     maxP = prices[i]-prices[j];
//	             }
//	         }
//	         return maxP;
	            
	        // Solution0 : Brute Force // Time limit exceeds
	    

//	         int maxP=0;
//	         for(int i=0; i<prices.length-1;i++)
//	         {
//	             for(int k=i+1;k<prices.length;k++)
//	             {
//	                 if(prices[k]-prices[i]>maxP)
//	                     maxP= prices[k]-prices[i];
//	             }
//	         }
//	         return maxP;
	    }
	}
}
