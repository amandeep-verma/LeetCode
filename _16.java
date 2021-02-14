
public class _16 {

	class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	        
	        
	        
	        // Solution1 : brute force
	        int closest = nums[0]+nums[1]+nums[2];
	        int howClose = Math.abs(target-closest);
	        for(int i=0 ;i < nums.length-2;i++)
	        {
	            for(int j=i+1 ;j < nums.length-1;j++)
	            {
	                for(int k=j+1 ;k < nums.length;k++)
	                {
	                    int sum = nums[i]+nums[j]+nums[k];
	                    int newHowClose = Math.abs(target-sum);
	                    if(newHowClose < howClose)
	                    {
	                        howClose = newHowClose;
	                        closest = sum;
	                    }
	                }
	            }
	        }
	        return closest;
	    }
	}
}
