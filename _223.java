
public class _223 {
	class Solution {
	    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        
	        boolean intersects = true;
	        
	         if(C-A==0 || D-B==0 || G-E==0 || H-F==0)
	            intersects = false;
	        
	        if( B>=H || D<=F || A>=G || C<=E)
	            intersects = false;

	        
	        int intersection =0;
	        if(intersects)
	        {
	            int x1 = Math.max(E,A);
	            int x2 = Math.min(C,G);
	            int y1 = Math.max(B,F);
	            int y2 = Math.min(D,H);
	            intersection = (y2-y1)*(x2-x1);
	        }

	        return (C-A)*(D-B) + (G-E)*(H-F) - intersection;
	        
	    }
	}
}
