
public class _14 {
	public static String longestCommonPrefix(String[] strs) {
		//		Solution 3
		if (strs.length == 0)
			return "";
		String first = strs[0];
		int maxL = strs[0].length();
		for (int i = 0; i < maxL; i++) {

			for (int j = 1; j < strs.length; j++) {
				if (strs[j] == "")
					return "";

				if (i < strs[j].length()) {
					if (first.charAt(i) != strs[j].charAt(i)) {
						maxL = i;
						return strs[0].substring(0, maxL);
					}
				}

				else if (i + 1 > strs[j].length()) {
					maxL = i;
					return strs[0].substring(0, maxL);
				}

			}
		}
		return strs[0].substring(0, maxL);




		//		Solution 2
		//		if (strs.length == 0)
		//			return "";
		//		
		//		int maxL = strs[0].length();
		//		
		//		for (int k = 1; k < strs.length; k++) {
		//			if (strs[k].length() == 0)
		//				return "";
		//			for (int l = 0; l < Math.min(strs[k].length(), maxL); l++) {
		//
		//				if (strs[0].charAt(l) != strs[k].charAt(l)) {
		//					maxL = l;
		//					break;
		//				} else {
		//					if (l + 1 == strs[k].length()) {
		//						maxL = l + 1;
		//					}
		//
		//				}
		//			}
		//		}
		//		return strs[0].substring(0, maxL);

		//		Solution 1
		//		if(strs.length==0)
		//			return "";
		//		int j=5;
		//		for(i=0; j>0 ;i++)
		//		{
		//			try {
		//				char current = strs[0].charAt(i);
		//				for (String s:strs)
		//				{
		//					if( current != s.charAt(i))
		//					{
		//						j=-1;
		//						break;
		//					}
		//
		//				}
		//			}
		//			catch(Exception e){
		//				i++;
		//				break;
		//			}
		//
		//		}
		//		return strs[0].substring(0,i-1);

	}

	public static void main(String[] args) {

		//		 String[] strs = {};
				String[] strs = { "flower", "flow", "flight" };
//				 String[] strs = {"dog","racecar","car"};
//				 String[] strs = {"flower","flower","flower"};
//				 String[] strs = {"a","aaa"};
//		String[] strs = { "a","a","b"};
		System.out.println(longestCommonPrefix(strs));

	}
}
