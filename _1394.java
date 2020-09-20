
public class _1394 {
	class Solution {
	    public int findLucky(int[] arr) {
	        
	        // Solution 1-
//	         int res =-1;
//	 		Map<Integer, Integer> map = new HashMap<>();
//	         for(int n :arr)
//	         {
//	             map.put(n, map.getOrDefault(n, 0)+1);
//	         }
//	         for (int a: map.keySet())
//	         {
//	         	if (a == map.get(a))
//	         		res = Math.max(a, res);
//	         }
//	         return res;
	        
	        
	                // Solution 2 - using extra array;
	        // int[] checker = new int[501];
	        // for (int a :arr)
	        // {
	        //     checker[a]++;
	        // }
	        // for (int i =500; i>0; i--)
	        // {
	        //     if ( checker[i]==i)
	        //         return i;
	        // }
	        // return -1;
	        
	        
	        // Solution 3 - using loop O(n logn)
	        //Sorting the array
	         Arrays.sort(arr);
	        // checking array from backward
	         for ( int i = arr.length-1; i>=0 ;i--)
	         {
	             // total (arr[i]) numbers should be equal to arr[i]
	             // checks if *i-arr[i]+1)th number is equal to arr[i]
	             if ( i-arr[i]+1 >=0 && arr[i-arr[i]+1] == arr[i])
	             {
	                 if(i-arr[i] >=0 )
	                 {
	                 // to check if not more than (arr[i]) elements are equal to arr[i]
	                     if (arr[i-arr[i]] != arr[i])
	                          return arr[i];
	                     // if more than, then jump all the elements using while loop
	                     else
	                     {
	                         int continuation = i-arr[i]-1;
	                         while(continuation >=0 && arr[continuation] == arr[i])
	                         {
	                             continuation--;
	                         }
	                         i = ++continuation;
	                     }
	                 }
	                 else 
	                      return arr[i];
	             }
	         }
	         return -1;
	    }
	}


}
