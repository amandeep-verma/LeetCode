
public class _20 {
	class Solution {
	    public boolean isValid(String s) {
	        
	        Stack<Character> stack = new Stack<Character>();
	        for(char a:s.toCharArray())
	        {
	            if( a == '(' || a == '[' || a == '{' )
	                stack.push(a);
	            else if(stack.size() == 0)
	                return false;
	            else{
	                if( a == ')' && stack.pop()!='(')
	                {
	                    return false;
	                }
	                else if( a == ']' && stack.pop()!='[')
	                {
	                    return false;
	                }
	                else if( a == '}' && stack.pop()!='{' )
	                {
	                    return false;
	                }
	            }
	        }
	        if(stack.size() ==0)
	            return true;
	         return false;
	    }
	}
}
