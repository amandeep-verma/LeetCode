
public class _55 {
	class Solution {
	    public boolean canJump(int[] nums) {
	        
	        
	        
	        // Sol-2 - linear solution
	        int jumpsPossible= 0;
	        for(int i =0 ;i<nums.length-1;i++)
	        {
	            jumpsPossible = Math.max(jumpsPossible-1, nums[i]);
	            if(jumpsPossible<=0)
	                return false;
	            
	        }
	        
	        return true;
	        
	        
	        //Solution 1 - finding the highest possible number in the range of the position your standing from
//	         if(nums[0]==0 && nums.length==1)
//	             return true;
//	         if(nums[0]==0)
//	             return false;
	        
//	         //int present = 0;
//	         for(int i =0 ;i< nums.length-1;)
//	         {
//	             if(nums[i]==0)
//	                 return false;
	            
//	             int highestPos=i;
//	             int highest=-1;
//	             for(int j =i+1; j<= i+ nums[i] && j<nums.length;j++)
//	             {
//	                 if(j==nums.length-1)
//	                     return true;
//	                 if(j+nums[j]>highest)
//	                 {
//	                     highest= j+nums[j];
//	                     highestPos= j;
//	                 }
//	             }
//	             i=highestPos;
//	         }
//	         return true;
	    }
	}
}
