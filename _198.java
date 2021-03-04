
public class _198 {
	class Solution {
	    public int rob(int[] nums) {
	        
	        
	        // Solution2 - without bucket
//	         if(nums.length==0)
//	             return 0;
//	         if(nums.length==1)
//	             return nums[0];
	        
//	         int pprev = nums[0];
//	         int prev= Math.max(nums[0],nums[1]);
//	         int sum=prev;
//	         for(int i =2; i<nums.length;i++)
//	         {
//	             sum = Math.max(prev,pprev+nums[i]);
//	             pprev= prev;
//	             prev = sum;
//	         }
//	         return sum;
	        
	        // Solution1 - with bucket
	        if(nums.length==0)
	            return 0;
	        if(nums.length==1)
	            return nums[0];
	        
	        int[] max = new int[nums.length];
	        max[0]=nums[0];
	        max[1]=Math.max(nums[0],nums[1]);
	        
	        for(int i =2; i<nums.length;i++)
	        {
	            max[i] = Math.max(max[i-2]+nums[i],max[i-1]);
	        }
	        return Math.max(max[nums.length-1],max[nums.length-2]);
	    }
	}
}
