
public class _561 {

	class Solution {
	    public int arrayPairSum(int[] nums) {
	        
	        Arrays.sort(nums);
	        int sum=0;
	        int n = nums.length;
	        for ( int i=0; i < n; i=i+2)
	        {
	            sum = sum +nums[i];
	            
	        }
	        return sum;
	    }
	}
}
