
public class _49 {
	class Solution {
	    
	    public static boolean anag(String a, String b)
		{
			if(a.length()!=b.length())
				return false;
			
			int[] acount= new int[26];
			
			for( int i =0;i<a.length();i++)
			{
				acount[a.charAt(i) -97]++ ;
				acount[b.charAt(i) -97]-- ;
			}
			
			
			for (int i =0; i<acount.length; i++)
			{
				if(acount[i]!=0)
					return false;
			}
			
			return true;
		}
		
		public static  List<List<String>> groupAnagrams(String[] strs) {

			List<List<String>> ret = new ArrayList<List<String>>();
			
			for (int i = 0; i < strs.length; i++) {
				
				boolean flag = true;
				for(int j =0 ; j< ret.size() ;j++)
				{
					if (anag(ret.get(j).get(0), strs[i]))
					{
						ret.get(j).add(strs[i]);
						flag = false;
						break;
					}
				}
				
				if(flag)
				{
					List<String> pt = new ArrayList<String>();
					ret.add(pt);
					pt.add(strs[i]);
				}
			}
			return ret;
		}
	}
}
