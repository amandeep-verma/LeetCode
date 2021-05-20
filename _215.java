package List1;

public class _215 {
	class Solution {
	    
	    public int nextMax(int[]nums, int pos)
	    {
            
 
	        for(int i =pos+1 ;i<nums.length;i++)
	        {
	            if( nums[pos] == nums[i])
	            {
	                return i;
	            }
	        }
            
            int nextMax = Integer.MIN_VALUE;
            int npos=0;
            
	        for(int i =0 ;i<nums.length;i++)
            {
                if(nums[i]>nextMax && nums[i]<nums[pos])
                {
                    nextMax = nums[i];
                    npos = i;
                }
            }
            return npos;
	    }
	    
    public int findKthLargest(int[] nums, int k) {
        
        // Solution 2 - super slow but works
        int a1= nums[0];
        int pos = 0;
        for(int i=0 ; i<nums.length; i++)
        {
            if(a1<nums[i])
            {
                a1= nums[i];
                pos = i;
            }
        }

        while(k!=1)
        {
            pos = nextMax(nums, pos);
            k--;
        }
        
        return nums[pos];
        
        // Solution 1
        // Arrays.sort(nums);
        // return nums[nums.length-k];
    }
}
}
