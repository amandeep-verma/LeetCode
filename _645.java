
public class _645 {
	class Solution {
	    public int[] findErrorNums(int[] nums) {
	        // Sol2
//	         int miss=0,rep=0;
//	         for(int  i =0;i<nums.length;i++)
//	         {
//	             int index = Math.abs(nums[i])-1;
//	             if(nums[index] <0)
//	                 rep = index+1;
//	             else
//	                 nums[index]*=-1;
//	         }
	        
//	         for(int i =0;i<nums.length;i++)
//	         {
//	             if(nums[i]>0)
//	                 miss = i+1;
//	         }
	        
//	          return new int[] {rep,miss};
	        
	        // Solution 1- Use bucket- linear
	        int[] bucket = new int[nums.length+1];
	        for(int  i =0;i<nums.length;i++)
	        {
	            bucket[nums[i]]++;
	        }
	        
	        int miss=0,rep=0;
	        for(int  i =1;i<nums.length+1;i++)
	        {
	            if(bucket[i]==0)
	                miss = i;
	            if(bucket[i]==2)
	                rep =i;
	        }
	        
	        return new int[] {rep,miss};
	    }
	}
}
