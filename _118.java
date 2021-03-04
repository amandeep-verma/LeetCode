
public class _118 {
	class Solution {
	    public List<List<Integer>> generate(int numRows) {
	        
	        List<List<Integer>> a = new ArrayList<List<Integer>>();
	        
	        List<Integer> last= new ArrayList<Integer>();
	        last.add(1);
	        a.add(last);
	        for(int i =2; i<=numRows;i++)
	        {
	            List<Integer> curr= new ArrayList<Integer>();
	            int j;
	            for(j=1; j<=i/2+1; j++)
	            {
	                if(j==1 || j==i)
	                    curr.add(1);
	                else
	                {
	                    curr.add(a.get(i-2).get(j-2) +a.get(i-2).get(j-1));
	                }
	            }
	            for( ;j<=i;j++)
	            {
	                if(j==i)
	                    curr.add(1);
	                else
	                    curr.add(curr.get(i-j));
	            }
	            
	            a.add(curr);
	        }
	        
	        return a;
	    }
	}
}
