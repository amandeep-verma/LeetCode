
public class _59 {

	class Solution {
	    public int[][] generateMatrix(int n) {
	        int[][] matrix = new int[n][n];
	        
	        int startx = 0;
	        int starty =0;
	        int endx = n-1;
	        int endy = n-1;
	        int num =1;

	        while( startx <= endx )
	        {

	            for(int i = startx; i<=endx ;i++)
	            {
	                matrix[starty][i] =num++;
	            }
	            starty ++;
	            if(starty > endy)
	                break;

	            for(int j = starty; j<=endy ;j++)
	            {
	                matrix[j][endx]=num++;
	            }
	            endx--;
	            if(startx > endx)
	                break;
	            
	            for(int i = endx; i>=startx ;i--)
	            {
	                matrix[endy][i] =num++;
	            }
	            endy--;
	            if(starty > endy)
	                break;
	            
	            for(int j = endy; j>= starty ;j--)
	            {
	                matrix[j][startx] =num++;
	            }
	            startx++;
	        }
	        
	        
	        return matrix;
	    }
	}
}
