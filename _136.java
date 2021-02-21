
public class _136 {
	class Solution {
	    public int singleNumber(int[] nums) {
	        
	        
	        
	        
	        
	        // solution1: using HashSet
	        HashSet<Integer> map = new HashSet<Integer>();
	        
	        for(int i =0; i <nums.length;i++)
	        {
	            if(map.contains(nums[i]))
	                map.remove(nums[i]);
	            else
	                map.add(nums[i]);
	        }
	        
	        for(Integer a: map.toArray(new Integer[0]))
	            return a;
	        return 0;
	        
	        

	    }
	}
}
