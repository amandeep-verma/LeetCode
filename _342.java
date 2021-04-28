
public class _342 {
	class Solution {
		public boolean isPowerOfFour(int n) {


			return (Math.log10(n) / Math.log10(4)) % 1 == 0;


			// With a brute force
			if(n ==1 )
				return true;
			else if(n<4)
				return false;
			int check = 1;
			for(int i =1;i<=15;i++)
			{
				check *= 4;
				if(check==n)
					return true;
			}
			return false;
		}
	}
}
