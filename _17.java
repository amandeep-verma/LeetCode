import java.util.ArrayList;
import java.util.List;

public class _17 {
	class Solution {
	    public List<String> letterCombinations(String digits) {
	        
	        // Solution 1 - recursive solution
//	         List<String> ret = new ArrayList();
//	         if(digits.equals(""))
//	             return ret;
	        
//	         String[] a = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        
//	         recursionHelper(a,digits,ret,0,new StringBuilder());
//	         return ret;
	        
	        // Solution2 - iterative
	        List<String> ret = new ArrayList();
	        if(digits.equals(""))
	            return ret;
	        
	        String[] a = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
	        ret.add("");
	        
	        for(int i=0; i<digits.length(); i++)
	        {
	            int lastSize = ret.size();
	            for(int j = 0; j < lastSize;)
	            {
	                for(char ch : a[digits.charAt(i)-'0'].toCharArray())
	                {
	                    ret.add(ret.get(j)+ch);
	                }
	                ret.remove(0);
	                lastSize--;  
	            }
	        }
	        return ret;
	    }
	    
//	       void recursionHelper(String[] a,String digits, List<String> ret, int pointer,StringBuilder pattern) {
	        
//	         if(pointer == digits.length())
//	         {
//	             ret.add(pattern.toString());
//	         }
//	         else
//	         {
//	             String pat = a[digits.charAt(pointer)-'0'];
//	             for (int i=0; i< pat.length(); i++ )
//	             {
//	                 pattern.append(pat.charAt(i));
//	                 lletterCombinations(a,digits,ret,pointer+1,pattern);
//	                 pattern.deleteCharAt(pattern.length()-1);
//	             }
//	         }   
//	     }
	  
	}
}
