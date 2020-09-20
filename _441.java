
public class _441 {

	class Solution {

		public int arrangeCoins(int n) {

			// Solution 2 - simplistic
			if (n == 1)
				return 1;

			int i = 0;
			while (i <= n) {
				n = n - i;
				i++;

			}

			return i - 1;

			 //Solution 1 -brute force
//			 if(n==1)
//			 return 1;
//			
//			 int coinsused=0;
//			 int i;
//			 // 1674699-1 is the max int which can be reached by k(k+1)/2
//			 for (i =1 ; i< 1674699 ;i++)
//			 {
//			 if (coinsused > n-i )
//			 break;
//			 coinsused+= (i);
//			 }
//			 return i-1;

		}
	}

}
