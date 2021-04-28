
public class _509 {
	class Solution {
	    public int fib(int n) {
	        
	        if(n==0)
	            return 0;
	        if(n==1)
	            return 1;
	        
	        int llast = 0;
	        int last =1;
	        int temp;
	        for(int i=2;i<=n;i++)
	        {
	            temp = llast;
	            llast = last;
	            last += temp;
	        }
	        
	        return last;
	    }
	}
}
