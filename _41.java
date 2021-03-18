
public class _41 {
	class Solution {
	    public int firstMissingPositive(int[] nums) {
	        
	        
	        // Given Condition, 0 <= nums.length <= 300, use bucket of size 302 to mark all the number in range 1 to 300 in the bucket. Now in the bucket array iterate from index 1 to 301 and return the first missing number.
			// Note: you can use array size 301 but I avoided it just to keep the program simple
	        
	        boolean[] bucket = new boolean[302];
	        for(int j =0 ;j<nums.length; j++)
	        {
	            if(nums[j]>0 && nums[j]<301)
	                bucket[nums[j]] = true;
	        }
	        
	        // since bucket[0] will always be false and we arent checking for it
	        int j;
	        for(j =1 ;j<302; j++)
	        {
	            if(!bucket[j])
	                return j;
	        }
	        return j;
	        
	        // Solution 2 : Since we know that array size is not more than 300, the return value is always less than 300
	        
	        // int i;
	        // for(i=1; i< 301;i++)
	        // {
	        //     boolean contains = false;
	        //     for(int j =0 ;j<nums.length; j++)
	        //     {
	        //         if(nums[j] == i)
	        //         {
	        //             contains= true;
	        //             break;
	        //         }
	        //     }
	        //     if(!contains)
	        //         return i;
	        // }
	        // return i;
	        
	        // Solution 1: Brute force - O(logn)
//	         Arrays.sort(nums);
//	         //find 1st positive number in array
//	         int i;
//	         for(i =0 ;i<nums.length; i++)
//	         {
//	             if(nums[i]>0)
//	                 break;
//	         }
	        
//	         if(i == nums.length || nums[i]!=1)
//	             return 1;
	        
//	         System.out.println(i);
//	         int value=2;
//	         i++;
//	         for(;i<nums.length; i++)
//	         {
	            
//	             if(nums[i]== nums[i-1])
//	                 continue;
//	             if(nums[i]!=value )
//	                 return value;
//	             value++;
//	         }
//	         System.out.println(value);
//	         return value;
	        
	    }
	}
}
