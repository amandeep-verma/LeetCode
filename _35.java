
public class _35 {
	class Solution {
	    
	    public int binaryS(int[] nums,int target)
	    {
	        int start =0, end = nums.length-1;
	        int mid=(start+end)/2;
	        while(start<=end)
	        {
	            mid = (start+end)/2;
	            if(nums[mid]==target)
	                return mid;
	            else if(nums[mid]<target)
	                start= mid+1;
	            else 
	                end=mid-1;
	        }
	        return mid;
	    }
	    public int searchInsert(int[] nums, int target) {
	        
	        // Solution3: binary search implementation
	        
	        if(target<nums[0])
	            return 0;
	        if(target>nums[nums.length-1])
	            return nums.length;
	            
	        int i=binaryS(nums,target);
	        
	        if(nums[i] >= target )
	            return i;
	        return i+1;
	        
	        
	        
	        
	        // Solution 2- O(log(n))
	        
	        // int i = Arrays.binarySearch(nums,target);
	        // if(i>-1)
	        //     return i;
	        // return  (-i)-1;
	        
	        
	        // Solution 1- O(n)
	        
	        // int i;
	        // for(i =0; i<nums.length; i++)
	        // {
	        //     if(target<= nums[i])
	        //         return i;
	        // }
	        // return i;
	    }
	}
}
