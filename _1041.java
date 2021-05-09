
public class _1041 {
	class Solution {
	    public boolean isRobotBounded(String ins) {
	        
	        // let direction facing in x axis be 0 degree
	        int dir = 90; // represting north
	        int x=0; 
	        int y=0;
	        
	        for ( int i = 0; i < ins.length(); i++)
	        {
	            char move = ins.charAt(i);
	            
	            if(move == 'L')
	                dir+= 90;
	            else if(move == 'R')
	                dir-= 90;
	            else{
	                
	                if(dir ==0 )
	                    x+=1;
	                else if(dir == 90)
	                    y+=1;
	                else if(dir == 180)
	                    x-=1;
	                else
	                    y-=1;
	            }
	            if(dir<0)
	                dir += 360;
	            else if(dir>=360)
	                dir -= 360;
	        }
	        
	        return dir != 90 || ( x==0 && y==0);   
	    }
	}
}
