
public class _1122 {

	class Solution {
		public int[] relativeSortArray(int[] arr1, int[] arr2) {

			// Solution3 using bucket of extra array - beats 100%
			int[] bucket = new int[1001];
			for (int i = 0; i < arr1.length; i++) {
				bucket[arr1[i]]++;
			}

			int j = 0, i = 0;
			// here you can chose to iterate over arr2, like in solution2
			for (i = 0; i < arr1.length && j < arr2.length; i++) {
				if (bucket[arr2[j]] != 0) {
					arr1[i] = arr2[j];
					bucket[arr2[j]]--;
				}

				if (bucket[arr2[j]] == 0)
					j++;
			}

			if (i != arr1.length) {
				for (int k = 0; k < bucket.length; k++) {
					while (bucket[k] != 0) {
						arr1[i++] = k;
						bucket[k]--;
					}
				}
			}
			return arr1;

			// Solution2 using bucket of hashmap,
			// better solution for when not the constraint doesnt exists-> 0 <= arr1[i],
			// arr2[i] <= 1000
//			HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
//			for (int i = 0; i < arr1.length; i++) {
//				maps.put(arr1[i], maps.getOrDefault(arr1[i], 0) + 1);
//			}
//
//			int pointer = 0;
//			for (int i = 0; i < arr2.length; i++) {
//				for (int j = 0; j < maps.get(arr2[i]); j++) {
//					arr1[pointer++] = arr2[i];
//				}
//				maps.remove(arr2[i]);
//			}
//
//			if (pointer != arr1.length) {
//				int tempP = pointer;
//				for (Integer a : maps.keySet()) {
//					for (int j = 0; j < maps.get(a); j++) {
//						arr1[tempP++] = a;
//					}
//				}
//				Arrays.sort(arr1, pointer, arr1.length);
//			}
//			return arr1;

			// Solution1 brute force
//			int pointer = 0;
//			for (int i = 0; i < arr2.length; i++) {
//				for (int j = pointer; j < arr1.length; j++) {
//					if (arr1[j] == arr2[i]) {
//						int temp = arr1[j];
//						arr1[j] = arr1[pointer];
//						arr1[pointer++] = temp;
//					}
//				}
//			}
//			if (pointer != arr1.length) {
//				Arrays.sort(arr1, pointer, arr1.length);
//			}
//			return arr1;
		}
	}
}
