
public class _349 {

	class Solution {
	    public int[] intersection(int[] nums1, int[] nums2) {
	        
	        // Solution2
	        if (nums1.length == 0 || nums2.length == 0)
				return new int[] {};

			Map<Integer, Integer> map = new HashMap();
			HashSet<Integer> res = new HashSet();
			for (int i = 0; i < nums1.length; i++) {

				map.put(nums1[i], 1);
			}

			for (int i = 0; i < nums2.length; i++) {
				if (map.get(nums2[i]) != null) {
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
			// if(nums1.length ==0 || nums2.length ==0)
			// return new int[]{};
			// Arrays.sort(nums1);
			// Arrays.sort(nums2);
			// List<Integer> res = new ArrayList();
			// for ( int i =0;i<nums1.length;i++)
			// {
			// if(i!=0 && nums1[i]==nums1[i-1])
			// {
			// continue;
			// }
			// if(Arrays.binarySearch(nums2,nums1[i]) >=0)
			// {
			// res.add(nums1[i]);
			// }
			// }
			// int[] res1 =new int[res.size()];
			// int pointer=0;
			// for(int a: res)
			// {
			// 	res1[pointer++]=a;
			// }
			// return res1;
	        
	    }
	}
}
