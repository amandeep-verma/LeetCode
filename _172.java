
public class _172 {
	class Solution {
	    
	    public boolean fact(int num)
	    {
	        int res = (num/5) *5;
	        return res==num;
	    }
	    
	    public int count(int num)
	    {
	        if((num/3125)*3125 ==num)
	            return 5;
	        if((num/625)*625 ==num)
	            return 4;
	         if((num/125)*125 ==num)
	            return 3;
	         if((num/25)*25 ==num)
	            return 2;
	         if((num/5)*5 ==num)
	            return 1;
	       
	        return 0;
	    }
	    
	    public int trailingZeroes(int n) {
	        //Solution3
	        
	        return n/5 + n/25 + n/125 +n/625 +n/3125 ;

	    // Solution2
//	        int zeros=0;
//	        for(int i =5 ;i<=n ;i=i+5)
//	        {
//	            zeros+= count(i);
//	        }
//	        return zeros;
	        
	    // Solution 1 - takes O(n*log(n)) time     
	        // int zeros=0;
	        // for(int i =5 ;i<=n ;i=i+5)
	        // {
	        //     int num = i;
	        //     while(fact(num))
	        //     {
	        //         num = num /5;
	        //         zeros++;
	        //     }
	        // }
	        // return zeros;
	        
	    }
	}
}
