
public class _414 {
	class Solution {
	    
	    public int nextMax(int[]nums, int high)
	    {
	        int max = Integer.MIN_VALUE;
	        for(int i =0 ;i<nums.length;i++)
	        {
	            if( nums[i]<high && nums[i]>max)
	            {
	                max = nums[i];
	            }
	        }
	        
	        return max;
	    }
	    
	    public int thirdMax(int[] nums) {
	        
	        
	        //Solution 3 -

//	         PriorityQueue<Integer> q = new PriorityQueue<>();
//	         HashSet<Integer> s = new HashSet<>();
	        
//	         for(int a:nums)
//	         {
//	             if(!s.contains(a))
//	             {
//	                 s.add(a);
//	                 q.add(a);
//	                 if(q.size()>3)
//	                 {
//	                     s.remove(q.poll());
//	                 }
//	             }
//	         }
	        
	        
	        
//	         if(q.size()!=3)
//	         {
//	             while(q.size()!=1)
//	             {
//	                 q.poll();
//	             }
//	         }
//	         return q.poll();
	        
	        // Solution 2 - 
	        HashSet<Integer> s = new HashSet<>();
	        int a1= nums[0];
	        
	        for(int i=0 ; i<nums.length; i++)
	        {
	            s.add(nums[i]);
	            if(s.size()==3)
	                break;
	        }
	        
	        for(int i=0 ; i<nums.length; i++)
	        {
	            if(a1<nums[i])
	                a1= nums[i];
	        }
	        
	        if(s.size()<3)
	            return a1;
	        
	        return nextMax(nums, nextMax(nums, a1));
	        
	        
//	         for(int i =0 ;i<nums.length;i++)
//	         {
//	             if(a1>nums[i] && a2<nums[i])
//	                 a2= nums[i];
//	         }
//	         for(int i =0 ;i<nums.length;i++)
//	         {
//	             if(a2>nums[i] && a3<nums[i])
//	                 a3= nums[i];
//	         }
	        
//	         return a3;
	        
	        
	        // solution1 - sort (bad solution)
//	         Arrays.sort(nums);
//	         int diff = 1;
//	         int i;
//	         for(i =nums.length-2 ;i>=0;i--)
//	         {
//	             if(nums[i+1]!= nums[i])
//	                 diff++;
//	             if(diff==3)
//	                 break;
//	         }
	        
//	         if(diff==3)
//	             return nums[i];
//	         else
//	             return nums[nums.length-1];
	        
	    }
	}
}
