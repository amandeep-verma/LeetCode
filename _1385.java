
public class _1385 {

	class Solution {
	    
	    public int[] removeDuplicates(int[] arr) {

		    int end = arr.length;

		    for (int i = 0; i < end; i++) {
		        for (int j = i + 1; j < end; j++) {
		            if (arr[i] == arr[j]) {                  
		                int shiftLeft = j;
		                for (int k = j+1; k < end; k++, shiftLeft++) {
		                    arr[shiftLeft] = arr[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = arr[i];
		    }
		    return whitelist;
		}
	    
	    // function to find the number closest to int a in sorted array arr2
	    public int numberClosest(int a, int[] arr2)
	    {
	        
	        int start =0;
			int end= arr2.length-1;
			int mid = 0;
			
			while(start<end)
			{
				mid = (end + start)/2;
				boolean flag1 = true; // represents mid < left
				boolean flag2 = true; // represents mid < right
				
				if (mid -1 >=0)
				{
					if (Math.abs(arr2[mid-1] -a) <= Math.abs(arr2[mid] -a))
					{
						flag1 = false;
					}
				}
				
				if(mid+1 < arr2.length)
				{
					if (Math.abs(arr2[mid+1] -a) <= Math.abs(arr2[mid] -a))
					{
						flag2 = false;
					}
				}
				if (flag1 && flag2)
				{
					return arr2[mid];
				}
				else if (!flag1)
				{
					if (mid -1 >=0)
					{
						end = mid;
					}
					else
						return arr2[mid];
				}
				else if (!flag2)
				{
					if (mid+1 < arr2.length)
					{
						start = mid+1;
					}
					else
						return arr2[mid];
				}
				
			}
			
			if(mid+1<arr2.length)
			{
				if(Math.abs(arr2[mid+1] -a) < Math.abs(arr2[mid] -a))
					return arr2[mid+1];
				
			}
			if (mid-1>=0) 
			{
				if(Math.abs(arr2[mid-1] -a) < Math.abs(arr2[mid] -a))
					return arr2[mid-11];
			}
			return arr2[mid];
	        
	    }
	    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

	        
	        // Solution2 - Without using Arrays.binarySearch
	        Arrays.sort(arr2);
	        arr2 = removeDuplicates(arr2);
	        int count = 0;
	        for( int i =0; i< arr1.length; i++)
	        {
	        	boolean cond = false;
	        	if(Math.abs(arr1[i] - numberClosest(arr1[i],arr2)) <= d)
	        			cond = true;
	            if(!cond)
	            {
	                 count++;
	            }
	         }
	         return count;
	        
	        //Solution1  Brute force
	        // int count = 0;
	        // for( int i =0; i< arr1.length; i++)
	        // {
	        //     boolean cond = false;
	        //     for ( int j=0; j<arr2.length; j++)
	        //     {
	        //         if(Math.abs(arr1[i]-arr2[j]) <= d)
	        //         {
	        //             cond = true;
	        //                 break;
	        //         }
	        //     }
	        //     if(!cond)
	        //     {
	        //         count++;
	        //     }
	        // }
	        // return count;
	    }
	}
}
