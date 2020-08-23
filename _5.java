
public class _5 {

	class Solution {

		public boolean checkP(String s)
		{
			return s.charAt(0) == s.charAt(s.length() - 1);
		}

		public String longestPalindrome(String s) {
			if (s.equals(""))
				return "";

			int max = 0;
			int start = 0;
			int end = 0;
			int maxk = 0;
			for (int i = 1; i < s.length() - 1; i++) {
				maxk = 0;

				if (checkP(s.substring(i - 1, i + 1 + 1))) {
					maxk = 1;
					for (int k = 2; k <= i && k < s.length() - i; k++) {
						if (checkP(s.substring(i - k, i + k + 1))) {
							maxk = k;
						} else
							break;
					}
					if (maxk * 2 + 1 > max) {
						max = maxk * 2 + 1;
						start = i - maxk;
						end = i + maxk;
					}

				}

			}

			for (int i = 1; i < s.length(); i++) {
				maxk = 0;
				if (checkP(s.substring(i - 1, i + 1))) {
					maxk = 1;
					for (int k = 2; k <= i && k <= s.length() - i; k++) {
						if (checkP(s.substring(i - k, i + k))) {
							maxk = k;
						} else
							break;
					}
					if (maxk * 2 > max) {
						max = maxk * 2;
						start = i - maxk;
						end = i + maxk - 1;
					}
				}
			}

			return s.substring(start, end + 1);
		}
	}

}


