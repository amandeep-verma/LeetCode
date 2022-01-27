
public class _1460 {

	class Solution {
	    public boolean canBeEqual(int[] target, int[] arr) {
	        
	        
	        //Solution 3 
	        //Use map instead of bucket from Sol 1
	        
	        
	        //Solution 2
	        // sort them and compare them
	        Arrays.sort(target);
	        Arrays.sort(arr);
	        return Arrays.equals(target,arr);
	        
	        //Solution 1
//	         int bucket[] = new int[1001];
	        
//	         for(int i =0;i<target.length;i++)
//	         {
//	             bucket[target[i]]++;
//	             bucket[arr[i]]--;
//	         }
	        
//	         for(int i =0;i<bucket.length;i++)
//	         {
//	             if(bucket[i]!=0)
//	                 return false;
//	         }        
//	         return true;

	        
	    }
	}
}
