
public class _695 {
	class Solution {
	    
	    public int manipulator(int[][] grid, int i, int j, int totalA)
	    {
	        if(i-1>=0 && grid[i-1][j]==1)
	        {
	            grid[i-1][j]=-1;
	            totalA=manipulator(grid,i-1,j,++totalA);
	        }
	        if(j-1>=0 && grid[i][j-1]==1)
	        {
	            grid[i][j-1]=-1;
	            totalA=manipulator(grid,i,j-1,++totalA);
	        }
	        if(i+1<grid.length && grid[i+1][j]==1)
	        {
	            grid[i+1][j]=-1;
	            totalA=manipulator(grid,i+1,j,++totalA);
	        }
	        if(j+1<grid[0].length && grid[i][j+1]==1)
	        {
	            grid[i][j+1]=-1;
	            totalA=manipulator(grid,i,j+1,++totalA);
	        }
	        
	        return totalA;
	    }
	    
	    public int maxAreaOfIsland(int[][] grid) {
	        int maxA =0;
	        //System.out.println(grid[0].length);
	        for( int i =0; i<grid.length; i++)
	        {
	            for( int j=0; j<grid[0].length; j++)
	            {
	                if(grid[i][j]==1)
	                {
	                    int currA = 1;
	                    grid[i][j]=-1;
	                    currA  = manipulator(grid, i, j, currA);
	                    if(currA >maxA)
	                        maxA= currA ;
	                    
	                }
	            }
	        }
	        return maxA;
	    }
	}
}
