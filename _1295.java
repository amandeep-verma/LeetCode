
public class _1295 {
	class Solution {
	    
	    int inbet(int[] nums,int start,int end)
	    {
	        int last = Arrays.binarySearch(nums,start);
	        int index = Arrays.binarySearch(nums,end);
	        
	        if(last <0)
	            last = -1*(last+1);
	        
	        if(index <0)
	            index = -1*(index+1);
	        
	        return index-last;
	    }
	    
	    public int findNumbers(int[] nums) {
	        
	        // Solution3 hybrid of both
	        int total=0;
	        for( int i=0; i<nums.length;i++)
	        {
	            if( (nums[i]>9 && nums[i]<100) || (nums[i]== 100000) || (nums[i]>999 && nums[i]<10000) )
	                total++;
	        }
	        return total;
	        
	        // Solution2 // by sorting 
	        
	        int total=0;
	        Arrays.sort(nums);
	        total = inbet(nums,10,100) + inbet(nums,1000,10000);
	        if(Arrays.binarySearch(nums,100000)>=0)
	            total++;
	        return total;
	        
	        // Solution1
	        
	        int total=0;
	        for( int i=0; i<nums.length;i++)
	        {
	            int totalD=1;
	            while(nums[i]>9)
	            {
	                nums[i]=nums[i]/10;
	                totalD++;
	            }
	            if(totalD %2 ==0)
	                total++;
	        }
	        return total;
	    }
	}
}
