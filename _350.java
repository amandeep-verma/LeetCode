import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _350 {

	class Solution {
	    public int[] intersect(int[] nums1, int[] nums2) {
	        
	        // Solution 2
	        if (nums1.length == 0 || nums2.length == 0)
				return new int[] {};

			Map<Integer, Integer> map = new HashMap();
			List<Integer> res = new ArrayList();
			
			for (int i = 0; i < nums1.length; i++) {
				int val =0;
				if(map.get(nums1[i])==null)
				{
					val =1;
				}
				else
				{
					val =  1+map.get(nums1[i]);
				}
				map.put(nums1[i], val);
			}
			
			for (int i = 0; i < nums2.length; i++) {
				if (map.get(nums2[i]) != null && map.get(nums2[i]) != 0) {
					map.put(nums2[i], map.get(nums2[i])-1);
					res.add(nums2[i]);
				}
			}
			
			int[] res1 = new int[res.size()];
			int pointer = 0;
			for (int a : res) {
				res1[pointer++] = a;
			}
			return res1;
	        
	        
	        // Solution 1
//	         if(nums1.length ==0 || nums2.length ==0)
//	 			return new int[]{};
//	 		Arrays.sort(nums1);
//	 		Arrays.sort(nums2);
//	 		List<Integer> res = new ArrayList();
//	         for ( int i =0,j=0;i<nums1.length && j<nums2.length;)
//	 		    {
//	     			if(nums1[i]==nums2[j])
//	     			{
//	     				res.add(nums1[i]);
//	     				j++;
//	     				i++;
//	     			}
//	     			else if(nums1[i]>nums2[j])
//	     			{
//	     				j++;
//	     			}
//	     			else if(nums1[i]<nums2[j])
//	     			{
//	     				i++;
//	     			}
//	 		}
//	 		int[] res1 =new int[res.size()];
//	 		int pointer=0;
//	 		for(int a: res)
//	 		{
//	 			res1[pointer++]=a;
//	 		}
//	 		return res1;
	    }
	}
}
