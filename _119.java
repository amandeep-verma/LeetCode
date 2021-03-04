
public class _119 {
	class Solution {
	    public List<Integer> getRow(int rowIndex) {
	        
	        int numRows= rowIndex+1;
	        List<Integer> last= new ArrayList<Integer>();
	        last.add(1);
	        
	        for(int i =2; i<=numRows;i++)
	        {
	            List<Integer> curr= new ArrayList<Integer>();
	            for(int j=1; j<=i; j++)
	            {
	                if(j==1 || j==i)
	                    curr.add(1);
	                else
	                    curr.add(last.get(j-2) +last.get(j-1));
	            }
	            last = curr;
	        }
	        
	        return last;
	    }
	}
}
