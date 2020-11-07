
public class _1051 {
	class Solution {
	    public int heightChecker(int[] heights) {
	        
	        //Solution 2 // beats 100%
	        int buff[] = new int[101];
	        for(int a:heights)
	            buff[a]++;
	        
	        int pt =1;
	        int count=0;
	        for(int i =0;i<heights.length;i++)
	        {
	            while(buff[pt] ==0 )
	            {
	                pt++;
	            }
	            
	            if(heights[i] != pt)
	            {
	                count++;
	            }
	            buff[pt]--;
	        }
	        return count;
	        
	        //Solution 1 // beats 86%
	            
	        int[] copy = heights.clone();
	        Arrays.sort(copy);
	        int count=0;
	        for(int i =0;i<heights.length;i++)
	        {
	            if(heights[i]!=copy[i])
	                count++;
	        }
	        return count;
	    }
	}
}
