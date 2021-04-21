
public class _697 {
	class Solution {
	    public int findShortestSubArray(int[] nums) {
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int maxValue=1;
	        for(int i =0; i<nums.length; i++)
	        {
	            if(!map.containsKey(nums[i]))
	                map.put(nums[i],1);
	            else
	            {
	                Integer count = map.get(nums[i])+1;
	                map.put(nums[i],count);
	                
	                if(count> maxValue)
	                    maxValue=count;
	            }
	        }
	        if(maxValue==1)
	            return 1;
	        
	        ArrayList<Integer> set = new ArrayList<Integer>();
	        
	        for(Integer a:map.keySet())
	        {
	            if(map.get(a)==maxValue)
	                set.add(a);
	        }
	        
	        int minD=nums.length;
	        for(Integer a:set)
	        {
	            System.out.println(a);
	            int startIndex=0;
	            for(int i =0; i<nums.length;i++)
	            {
	                if(nums[i]==a)
	                {
	                    startIndex=i;
	                    break;
	                }
	            }
	            int lastIndex=nums.length-1;
	            for(int i=nums.length-1; i>=0;i--)
	            {
	                if(nums[i]==a)
	                {
	                    lastIndex=i;
	                    break;
	                }
	            }
	            
	            int currD = lastIndex- startIndex+1;
	            
	            if(currD<minD)
	                minD=currD;
	        }
	        return minD;
	        
	    }
	}
}
