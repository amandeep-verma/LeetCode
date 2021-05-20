
public class _268 {
	class Solution {
	    
	    public int pos(int num)
	    {
	        num =  (num>=0) ?  num: -num;
	    	return num;
	    }
	    
	    public int missingNumber(int[] nums) {
	        // Solution2 O(1) extra space complexity and O(n) runtime complexity?
	        
	        int length = nums.length;
	       
	        for(int i =0 ;i<length;i++)
	        {
	            nums[i]+=1;
	        }

	        for(int i:nums)
	        {
	            if(pos(i)>length)
	                continue;
	            else
	                nums[pos(i)-1] *= -1; 
	        }
	        
	        for(int i =0 ;i<length;i++)
	        {
	            if(nums[i]>0)
	                return i;
	        }
	        return length;
	        
	             
	        // Solution1 boolean bucket
	        
//	         boolean[] bucket = new boolean[nums.length+1];
	        
//	         for(int a:nums)
//	         {
//	             bucket[a] = true;
//	         }
	        
//	         for(int i =0 ;i<bucket.length;i++)
//	         {
//	             if(!bucket[i])
//	                 return i;
//	         }
//	         return 0;
	    }
	}
}
