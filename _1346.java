
public class _1346 {
	class Solution {
	    

	    public boolean checkIfExist(int[] arr) {
	        
	        // Sol3- Using hashset
//	         HashSet<Integer> set = new HashSet<Integer>();
	        
//	         for(int i=0;i<arr.length;i++)
//	         {
//	             if(set.contains(2*arr[i]) || ( arr[i]%2==0 && set.contains(arr[i]/2))) 
//	                 return true;
//	             else
//	                 set.add(arr[i]);
//	         }
//	         return false;
	        
	        // Sol2 brute force
	        
//	          for(int i=0;i<arr.length-1;i++)
//	          {
//	              for(int j=i+1; j<arr.length;j++)
//	              {
//	                  if(arr[i]==2*arr[j] || 2*arr[i]==arr[j])
//	                      return true;
//	              }
//	          }
//	         return false;
	        
	        
	        // Sol 1 - Sort them
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length;i++)
	        {
	            if(Arrays.binarySearch(arr,2*arr[i])>=0)
	            {
	                if(Arrays.binarySearch(arr,2*arr[i]) !=i) // will only be checked once for zero
	                    return true;
	            }
	        }
	        return false;
	    }
	}
}
