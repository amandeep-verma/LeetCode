
public class _485 {

	class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        
	        //Solution 2
	        int sum = nums[0];
	        int maxSum = nums[0];
	       
	        for(int i = 1; i< nums.length;i++)
	        {
	            if(nums[i]==0)
	            {
	                sum =0;
	                if(maxSum>=nums.length-i)
	                    break;
	            }
	            else 
	                sum++;
	            
	            if(maxSum<sum)
	                maxSum = sum;
	        }
	        return maxSum;
	        
	        //Solution 1
//	         int max = nums[0];
//	         int currentMax = max;
//	         boolean lastone = nums[0]==1?true:false;
//	         for(int i = 1; i< nums.length;i++)
//	         {
//	             if(nums[i]==1 && lastone)
//	                 currentMax++;
//	             else if(nums[i]==1)
//	             {
//	                 lastone = true;
//	                 currentMax=1;
//	             }
//	             else
//	                 lastone=false;
	            
//	             if(currentMax>max)
//	                 max = currentMax;
//	         }
	        
//	         return max;
	        
	    }
	}
}
