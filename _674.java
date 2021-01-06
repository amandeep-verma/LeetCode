
public class _674 {
	class Solution {
	    public int findLengthOfLCIS(int[] nums) {
	        if(nums.length==0)
	            return 0;
	        
	        int sizeM=0;
	        int size=1;
	        for(int i =1; i<nums.length;i++)
	        {
	            if(nums[i] > nums[i-1])
	            {
	                size++;
	            }
	            else
	            {
	                if(size >sizeM)
	                    sizeM= size;
	                size=1;
	            }
	        }
	        
	        if(size >sizeM)
	            return size;
	        
	        return sizeM;
	    }
	}
}
