
public class _91 {

	class Solution {
	    public int numDecodings(String s) {
	        if(s.charAt(0)=='0')
	            return 0;
	        if(s.length()==1)
	            return 1;
	            
	        int prevPos = 1;
	        int pos= 1;
	        for( int i =1; i<s.length(); i++)
	        {
	            int deco = Integer.parseInt(s.substring(i-1,i+1));
	            if(s.charAt(i) =='0' )
	            {
	                if(!(s.charAt(i-1)=='1' ||  s.charAt(i-1)=='2'))
	                    return 0;
	                else
	                    pos = prevPos;
	            }
	            else if(deco <27 && deco >9 )
	            {
	                int temp = pos + prevPos;
	                prevPos = pos;
	                pos = temp;
	            }
	            else
	            {
	                prevPos=pos;
	            }
	        }
	        return pos;
	        
	    }
	}
}
