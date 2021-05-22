
public class _554 {
	class Solution {
	    public int leastBricks(List<List<Integer>> wall) {
	        List<Integer> row = wall.get(0);
	        int sum=0;
	        
	        Map<Integer, Integer> a = new HashMap<>();
	        
	        for(int i=0; i<wall.size();i++)
	        {
	            List<Integer> currentRow = wall.get(i);
	            int holder = 0;
	            for(int j =0; j<currentRow.size()-1; j++)
	            {
	                holder += currentRow.get(j);
	                a.put(holder,1+a.getOrDefault(holder,0)); 
	            }
	        }
	        
	        if(a.size()==0)
	            return wall.size();
	        
	        int maxValueNum=0;
	        
	        Set<Integer> keys = a.keySet();
	        for(Integer key:keys)
	        {
	            if(a.get(key)>maxValueNum)
	                maxValueNum = a.get(key);
	        }
	        
	        return wall.size()-maxValueNum;
	        
	    }
	}
}
