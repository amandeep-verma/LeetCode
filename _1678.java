
public class _1678 {
	class Solution {
	    public String interpret(String command) {
	        
	        StringBuilder ret = new StringBuilder();
	        
	        for(int i =0; i<command.length();i++)
	        {
	            if(command.charAt(i) =='G')
	                ret.append('G');
	            else if(command.charAt(i) =='(' && command.charAt(i+1) ==')')
	            {
	                ret.append('o');
	                i++;
	            }
	            else
	            {
	                ret.append("al");
	                i=i+3;
	            }
	        }
	        return ret.toString();
	    }
	}
}
