
public class _283 {
	class Solution {
	    public void moveZeroes(int[] nums) {
	        
	        
	        int pointer=0;
	        int runner=0;
	        for(int i=0; i<nums.length; i++)
	        {
	            if(nums[i]!=0)
	            {
	                nums[pointer++] = nums[i];
	            }
	        }
	        
	        for(int i=pointer; i<nums.length; i++)
	        {
	            nums[i]=0;
	        }
	    }
	}
}
