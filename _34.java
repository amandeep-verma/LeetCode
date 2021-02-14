
public class _34 {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int[] ret = {-1,-1};

	        int pos = Arrays.binarySearch(nums,target);
	        if(pos<0)
	            return ret;
	        
	        ret[0]=pos;
	        ret[1]=pos;
	        
	        while(pos-1 >=0 && nums[pos-1] == target)
	            pos--;
	        
	        ret[0]=pos;
	        pos = ret[1];
	        
	        while(pos+1 < nums.length && nums[pos+1] == target)
	            pos++;
	        
	        ret[1]=pos;
	        return ret;
	    }
	}
}
