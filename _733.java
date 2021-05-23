
public class _733 {
	class Solution {
	    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	        if(image[sr][sc] == newColor)
	            return image;
	        
	        int source = image[sr][sc];
	        image[sr][sc] = newColor;
	        
	        if(sc>0 && image[sr][sc-1]==source)
	        {
	            floodFill(image,sr,sc-1,newColor);
	        }
	        if(sc<image[0].length-1 && image[sr][sc+1]==source)
	        {
	            floodFill(image,sr,sc+1,newColor);
	        }
	        if(sr>0 && image[sr-1][sc]==source)
	        {
	            floodFill(image,sr-1,sc,newColor);
	        }
	        if(sr< image.length-1 && image[sr+1][sc]==source)
	        {
	            floodFill(image,sr+1,sc,newColor);
	        }
	        
	        return image;
	    }
	}
}
