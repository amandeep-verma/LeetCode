
public class _287 {
	class Solution {
	    public int findDuplicate(int[] nums) {
	        
	        // Solution2 - faster
	        boolean[] bucket = new boolean[nums.length+1];
	        for(int  i =0;i<nums.length;i++)
	        {
	            if(bucket[nums[i]] == true)
	                return nums[i];
	            else
	                bucket[nums[i]] = true;
	        }
	        return nums[0];
	        
	        // Solution 1 - 
//	         HashSet<Integer> set = new HashSet<Integer>();
	        
//	         for(int  i =0;i<nums.length;i++)
//	         {
//	             if(set.contains(nums[i]))
//	                 return nums[i];
//	             else
//	                 set.add(nums[i]);
//	         }
//	         return nums[0];
	    }
	}
}
