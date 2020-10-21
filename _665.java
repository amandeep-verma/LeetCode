
public class _665 {
	class Solution {
	    public boolean checkPossibility(int[] nums) {
	        if(nums.length==1)
				return true;
			
	        int flag=0;
	        
	        if(nums[0]>nums[1])
	        	flag++;
	        
	        for ( int i =1 ; i< nums.length-1; i++)
	        {
	            if ( nums[i] > nums[i+1] )
	            {
	            	if(nums[i+1] - nums[i-1] >= 0)
	            	{
	            		flag++;
	            	}
	            	else if(i+2<nums.length && nums[i+2]-nums[i] > 0)
	            	{
	            		flag++;
	            	}
	                else if(i+1 == nums.length-1)
	            	{
	            		flag++;
	            	}
	            	else
	            		return false;
	                if(flag==2)
	                    return false;
	            }
	        }
	        return true;
	    }
	}
}
