
public class _88 {
	class Solution {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
			if (nums2.length == 0)
				return;

			int lastp = nums1.length - 1;

			for (int i = m - 1; i >= 0; i--) {
				int temp = nums1[lastp];
				nums1[lastp--] = nums1[i];
				nums1[i] = temp;
			}

			int i, j = nums2.length, k = 0;

			for (i = 0; i < nums1.length && j < nums1.length && k < nums2.length; i++) {
				if (nums1[j] < nums2[k]) {
					int temp = nums1[j];
					nums1[j++] = nums1[i];
					nums1[i] = temp;
				} else {
					nums1[i] = nums2[k++];
				}
			}

			while (k < nums2.length) {
				nums1[i++] = nums2[k++];
			}

		}
	}
}
