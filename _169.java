import java.util.Arrays;

public class _169 {
	class Solution {
	    public int majorityElement(int[] nums) {

	        // Solution 2 - Sort the array and majority elemenent sits on n/2th position
	        Arrays.sort(nums);
	        return nums[nums.length/2];
	        
	        
	        // Solution1 - Using hashMap
	        // n logn solution
	        
//	         Map<Integer,Integer> a = new HashMap<Integer,Integer>();
//	         for(int i=0; i<nums.length;i++)
//	         {
//	             if(a.containsKey(nums[i]))
//	             {
//	                 int d = a.get(nums[i]);
//	                 a.put(nums[i],++d);
//	             }
//	             else
//	                a.put(nums[i],1);
	            
//	             if(a.get(nums[i])> nums.length/2)
//	                 return nums[i];
//	         }
//	         return 0;
	    }
	}
}
