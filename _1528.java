
public class _1528 {
	class Solution {
	    public String restoreString(String s, int[] indices) {
	        
	        char[] kaboom = s.toCharArray();
	        
	        for(int i =0 ;i<indices.length;i++)
	        {
	            kaboom[indices[i]] = s.charAt(i);
	        }
	        
	        return new String(kaboom);
	    }
	}
}
