
public class _202 {
	class Solution {
	    
	    
	    static Set<Integer> set = new HashSet<>(Arrays.asList(new Integer[]{1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100, 103, 109, 129, 130, 133, 139, 167, 176, 188, 190, 192, 193, 203, 208, 219, 226, 230, 236, 239, 262, 263, 280, 291, 293, 301, 302, 310, 313, 319, 320, 326, 329, 331, 338, 356, 362, 365, 367, 368, 376, 379, 383, 386, 391, 392, 397, 404, 409, 440, 446, 464, 469, 478, 487, 490, 496, 536, 556, 563, 565, 566, 608, 617, 622, 623, 632, 635, 637, 638, 644, 649, 653, 655, 656, 665, 671, 673, 680, 683, 694, 700, 709, 716}));
	    public boolean isHappy(int num) {
	        
	        // Solution3 - Find all happy number in between 1-730 and store them 
	        
	        int sq=0;
	        while(num!=0)
	        {
	            int lDigit = num%10;
	            num=num/10;
	            sq = lDigit*lDigit+sq;
	        }
	        
	        if(set.contains(sq))
	            return true;
	        return false;
	        
	        //Solution2 - Use bucket, Instead of Set
	        // Bucket size - imagine the maxnumber which can be computer by sum of square of each digit. Which goes on to say each digit should be max. 2^31 is 10 digits. Imagine each digit 9 (ofcourse ignoring cases num>2^31), the sum of square of each digit would be 81*10(10 digits) = 810. Thats the bucket size we need.
	        
	        // Or if you check you will figure out the number 1999999999 generates max possible number(which is 730) by sum of square of each digit.
	        
	        // int[] bucket = new int[731];
	        // while(num>730 || bucket[num]==0)
	        // {
	        //     if(num<731)
	        //         bucket[num]=1;
	        //     int sq=0;
	        //     while(num!=0)
	        //     {
	        //         int lDigit = num%10;
	        //         num=num/10;
	        //         sq = lDigit*lDigit+sq;
	        //     }
	        //     if(sq==1)
	        //         return true;
	        //     num = sq;
	        // } 
	        // return false;
	        
	        // Solution 1
//	         Set<Integer> l = new HashSet<Integer>();        
//	         while(!(l.contains(num)))
//	         {
//	             l.add(num);
//	             int sq=0;
	            
//	             while(num!=0)
//	             {
//	                 int lDigit = num%10;
//	                 num=num/10;
//	                 sq = lDigit*lDigit+sq;
//	             }
//	             System.out.println(sq);
//	             if(sq==1)
//	                 return true;
//	             num = sq;
//	         }
//	         return false;
	    }
	}
}
