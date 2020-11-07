
public class _167 {

	class Solution {
	    public int[] twoSum(int[] numbers, int target) {
	        
	        // 2 pointer solution
	        int i=0,j=numbers.length-1;
	        while(j>i)
	        {
	            if(numbers[i]+numbers[j]==target)
	            {
	                return new int[]{i+1,j+1};
	            }
	            else if(numbers[i]+numbers[j]>target)
	            {
	                j--;
	            }
	            else
	            {
	                i++;
	            }
	        }
	        
	        return new int[]{};
	        
	        // Not so efficient
//	        for ( int i =0; i<numbers.length; i++)
//	        {
//	            int pos = Arrays.binarySearch(numbers,i+1,numbers.length,target - numbers[i]);
//	            if(pos >=0)
//	            {
//	                return new int[]{i+1,pos+1};
//	            }
//	        }
//	        
//	        return new int[]{};
	        
	        // Not so good, as it is not taking advantage of sorted array
//	        Map<Integer,Integer> a = new HashMap<Integer,Integer>();
//	        for ( int i =0; i<numbers.length; i++)
//	        {
//	            int compliment = target - numbers[i];
//	            if(a.containsKey(compliment))
//	            {
//	                return new int[]{a.get(compliment)+1,i+1};
//	            }
//	            a.put(numbers[i],i);
//	        }
//	        
//	        return new int[]{};
	    }
	}
}
