
public class _367 {
	class Solution {
	    public boolean isPerfectSquare(int num) {
	        
	        // Solution 2
			if (num > 2147395600)
				return false;
			else if (num == 2147395600)
				return true;
			int l = 0;
			int r = 46340;
			while (l < r) {
				int m = (l + r) / 2;
				if (m * m == num)
					return true;
				else if (m * m < num)
					l = m + 1;
				else
					r = m - 1;
			}
			return r * r == num;
	        
	        
	        // Solution 1
	        
//	 	    double a = (Math.sqrt(num));
//	 	    return a-(int)a == 0;
	    }
	}
}
