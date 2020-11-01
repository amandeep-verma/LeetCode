
public class _242 {
	class Solution {
	    public boolean isAnagram(String a, String b) {
	        
	        
			// char[] a1 = a.toCharArray();
			// char[] b1 = b.toCharArray();
	        
	        
	        // Solution 1
	        if(a.length()!=b.length())
				return false;
			
			int[] acount= new int[26];
			
			for( int i =0;i<a.length();i++)
			{
				acount[a.charAt(i) -97]++ ;
				acount[b.charAt(i) -97]-- ;
			}
			
			for (int i =0; i<a.length(); i++)
			{
	            
	            if ( acount[b.charAt(i)-97] != 0 )
	                return false;
					
			}
			
			return true;
	    }
	}
}
