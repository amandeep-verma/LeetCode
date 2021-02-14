
public class _15 {

	class Solution {
	    public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> ret = new ArrayList<List<Integer>>();
	        if(nums.length==0)
	            return ret;
	        
	        Arrays.sort(nums);
	        System.out.println(Arrays.toString(nums));
	        // first occurance of least negative number and least positive number
	        int firstPos =-1;
	        int firstNeg =-1;
	        for(int i=0 ;i < nums.length;i++)
	        {
	            if(nums[i] >0)
	            {
	                firstPos= i;
	                break;
	            }
	        }      
	        for(int i=nums.length-1 ;i >=0;i--)
	        {
	            if(nums[i] < 0)
	            {
	                firstNeg= i;
	                break;
	            }
	        }     
	        
	        if(firstNeg == -1)
	        {
	            if (firstPos>2 || (firstPos == -1 && nums.length>2))
	                ret.add(Arrays.asList(0,0,0));
	            return ret;
	            
	        }
	        else if(firstPos == -1)
	        {
	            if(nums.length-firstNeg > 3)
	                ret.add(Arrays.asList(0,0,0));
	            return ret;
	        }
	                
	        if(firstPos - firstNeg >3)
	        {
	            ret.add(Arrays.asList(0,0,0));
	        }
	        
	        // check for one number 0 and 2 complimenting each other
	        if(firstPos - firstNeg >1)
	        {
	            int lastNum = 1;
	            for(int i =0; i<= firstNeg; i++)
	            {
	                if(lastNum == nums[i] )
	                    continue;
	                int index = Arrays.binarySearch(nums,firstPos, nums.length, nums[i]*-1);
	                if(index >=0)
	                {
	                    ret.add(Arrays.asList(nums[i],0,nums[index]));
	                }
	                lastNum = nums[i];
	            }
	        }
	        
	        // Group 2 non repetive - ve number and find non their compliment in postive side, 
	        // if you do so break it up 
	        int lastFirst = 1;
	        int lastSec;
	        for(int i =0; i< firstNeg; i++)
	        {
	            if(lastFirst == nums[i] )
	                continue;
	            lastSec = 1 ;
	            for( int j =i+1; j<=firstNeg;j++)
	            {
	                if(lastSec == nums[j])
	                    continue;
	                
	                int kingMaker = (nums[i]+nums[j])*-1 ;
	                int index = Arrays.binarySearch(nums,firstPos, nums.length, kingMaker);
	                if(index >=0)
	                {
	                    ret.add(Arrays.asList(nums[i],nums[j],nums[index]));
	                }
	                lastSec = nums[j];
	            }
	            lastFirst = nums[i];
	        }
	        lastFirst = -1;
	        lastSec = -1 ;
	        
	        for(int i =firstPos; i< nums.length-1; i++)
	        {
	            if(lastFirst == nums[i] )
	                continue;
	            lastSec = -1;
	            for( int j =i+1; j<nums.length;j++)
	            {
	                if(lastSec == nums[j])
	                    continue;
	                
	                int kingMaker = (nums[i]+nums[j])*-1 ;
	                int index = Arrays.binarySearch(nums,0,firstNeg+1, kingMaker);
	                if(index >=0)
	                {
	                    ret.add(Arrays.asList(nums[i],nums[j],nums[index]));
	                }
	                lastSec = nums[j];
	            }
	            lastFirst = nums[i];
	        }
	        
	        return ret;
	        
	        
//	         Arrays.binarySearch(nums,0);
//	         System.out.println(Arrays.toString(nums));
	        
//	         int[] sums = new int[nums.length-1];
	        
//	         for( int i =0; i<sums.length;i++)
//	         {
//	             sums[i]= nums[i]+nums[i+1];
//	         }
	    
	        // for( int i =0; i<sums.length;i++)
	        // {
	        //     for( int j =i+2; j<nums.length;j++)
	        //     {
	        //         if(i==j || i==j-1)
	        //             continue;
	        //         if( sums[i]+nums[j] == 0)
	        //         {
	        //             ret.add(Arrays.asList(nums[i],nums[i+1],nums[j]));
	        //         }
	        //     }
	        // }
	        
	        
	        
	    }
	}
}
