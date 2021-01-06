
public class _80 {

	class Solution {
	    public int removeDuplicates(int[] nums) {
	        
	        int counter =1;
	        int tempC =1;
	        for (int i =1;i<nums.length;i++)
	        {
	            if(nums[i-1] != nums[i] )
	            {
	                nums[counter++]=nums[i];
	                tempC=1;
	            }
	            else if(tempC < 2)
	            {
	                nums[counter++]=nums[i];
	                tempC++;
	            }
	        }
	        
	        return counter;
	        
	    }
	}
}
