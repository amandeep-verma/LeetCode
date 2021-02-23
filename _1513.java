
public class _1513 {
	class Solution {
	    public int numSub(String s) {
	        
	        int count =0;
	        for(int i =0; i<s.length();i++)
	        {
	            //System.out.println(i);
	            int sum=0;
	            while(i<s.length() && s.charAt(i)=='1')
	            {
	                sum++;
	                count = (count +sum)%1000000007;
	                i++;
	            }
	        }
	        return count;
	    }
	}
}
