
public class _740 {

	class Solution {
	    public int deleteAndEarn(int[] nums) {
	                
	    	// Solution 2.2
//	         Arrays.sort(nums);
	        
//	         int sum = 0;
//	         int prevSum = 0;
//	         int last = 0;
//	         int i=0;
//	         while(i<nums.length)
//	         {
//	             int j =i;
//	             while(i<nums.length && nums[i]==nums[j])
//	                 i++;
	            
//	             int currSum=nums[j] *(i-j);
	            
//	             int temp = sum;
//	             if(nums[j]-1 != last)
//	                 sum+=currSum;
//	             else
//	                 sum = Math.max(sum, prevSum+currSum);
	            
//	             prevSum = temp;
//	             last = nums[j];
	            
//	         }
	        
//	         return sum;
	        
	        
	        // Solution 2.1
//	         Arrays.sort(nums);
	        
//	         int i=1;
	        
//	         while(i<nums.length && nums[i]==nums[0])
//	             i++;
	        
//	         int sum = nums[0]*(i);
//	         // int prevSum = sum;
//	         int prevSum = 0;
	        
//	         int last= nums[0];
	        
//	         for(;i<nums.length; )
//	         {
//	             int j =i;
//	             int temp = sum;
//	             while(i<nums.length && nums[i]==nums[j])
//	                 i++;
	            
//	             int currSum=nums[j] *(i-j);
	            
//	             if(nums[j]-1 != last)
//	                 sum+=currSum;
//	             else
//	                 sum = Math.max(sum, prevSum+currSum);
	            
//	             prevSum = temp;
//	             last = nums[j];
	            
//	         }
	        
//	         return sum;
	        
	        //Solution- 1
	        if(nums.length==1)
	            return nums[0];
	        
	        int[] bucket = new int[10002];
	        
	        for(int i =0; i<nums.length;i++)
	        {
	            bucket[nums[i]]+=nums[i];
	        }
	        
	        int sum =0;
	        for(int i =bucket.length-1; i>0;i--)
	        {
	            if(bucket[i]!=0)
	            {
	                
	                if(bucket[i-1]==0)
	                    sum = sum+bucket[i];
	                else if(bucket[i-2]==0){
	                    sum= sum +Math.max(bucket[i],bucket[i-1]);
	                    i--;
	                    }
	                else
	                {
	                    i--;
	                    while(bucket[i]!=0)
	                    {
	                        bucket[i]= Math.max(bucket[i+1],bucket[i]+bucket[i+2]);
	                        i--;
	                    }
	                    sum+=bucket[i+1];
	                }
	            }
	        }
	        
	        return sum;

	    }
	}
}
