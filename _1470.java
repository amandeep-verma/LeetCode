
public class _1470 {

	class Solution {
	    public int[] shuffle(int[] nums, int n) {
	        
	        // Solution 1 // not in-place
	        int[] res = new int[2*n];
	        for(int i =0; i<n;i++){
	            res[2*i] = nums[i];
	            res[2*i + 1] = nums[i+n];
	        }
	        return res;
	    }
	}
}
