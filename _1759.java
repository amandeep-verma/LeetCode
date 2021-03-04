
public class _1759 {

	class Solution {
	    public int countHomogenous(String s) {
	        //Solution X: finding the largest homogenous and compute
	        
	        //Solution 3- Using long - in outer loop
	        if(s.length()==1)
	            return 1;
	        
	        int count = 0;
	        for(int i =0; i<s.length(); )
	        {
	            char last = s.charAt(i);
	            int j;
	            for(j =i+1; j<s.length(); j++)
	            {
	                if(s.charAt(j)!=last)
	                    break;
	            }
	            int newAdd= j-i;
	            if(newAdd > 45000)
	                count = count + (int)(((newAdd)*(long)(newAdd+1)/2)%1000000007);
	            else
	                count = count + (((newAdd)*(newAdd+1)/2)%1000000007);
	            
	            i=j;
	        }
	        return (count);
	        
	        
	        //Solution 2- Using int
//	         int count = s.length();
//	         for(int i =0; i<s.length()-1; )
//	         {
//	             char last = s.charAt(i);
//	             int j;
//	             for(j =i+1; j<s.length(); j++)
//	             {
//	                 if(s.charAt(j)!=last)
//	                     break;
//	                 int newAdd= j-i;
//	                 count = (count + newAdd)%1000000007;
//	             }
//	             i=j;
//	         }

//	         return (count);
	        
	        
	        //Solution 1- Using double
//	         double count = s.length();
//	         for(int i =0; i<s.length()-1; )
//	         {
//	             char last = s.charAt(i);
//	             int j;
//	             for(j =i+1; j<s.length(); j++)
//	             {
//	                 if(s.charAt(j)!=last)
//	                     break;
//	                 int newAdd= j-i;
//	                 count = count + newAdd;
//	             }
//	             i=j;
//	         }
	        
//	         return (int)(count%1000000007);
	    }
	}
	    
	
}
