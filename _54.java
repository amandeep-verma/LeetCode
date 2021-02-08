import java.util.ArrayList;
import java.util.List;

public class _54 {
	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        int startx = 0;
	        int starty =0;
	        int endx = matrix[0].length-1;
	        int endy =matrix.length-1;
	        
	        List a = new ArrayList();

	        while( startx <= endx )
	        {

	            for(int i = startx; i<=endx ;i++)
	            {
	                a.add(matrix[starty][i]);
	            }
	            starty ++;
	            if(starty > endy)
	                break;

	            for(int j = starty; j<=endy ;j++)
	            {
	                a.add(matrix[j][endx]);
	            }
	            endx--;
	            if(startx > endx)
	                break;
	            
	            for(int i = endx; i>=startx ;i--)
	            {
	                a.add(matrix[endy][i]);
	            }
	            endy--;
	            if(starty > endy)
	                break;
	            
	            for(int j = endy; j>= starty ;j--)
	            {
	                a.add(matrix[j][startx]);
	            }
	            startx++;
	        }
	        
	        return a;
	    }
	}
}
