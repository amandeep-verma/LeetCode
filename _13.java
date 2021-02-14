
public class _13 {
	class Solution {
	    public int romanToInt(String s) {
	        Map<Character, Integer> map = new HashMap<Character, Integer>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);

	        
	        int lastVal = map.get(s.charAt(s.length()-1));
	        int num = lastVal;
	        int currV;
	        for(int i=s.length()-2; i>=0; i--)
	        {
	            currV = map.get(s.charAt(i));
	            if (currV >= lastVal)
	                num = num + currV;
	            else
	                num = num - currV;
	            lastVal = currV;
	        }
	                   
	        return num;
	    }
	}
}
