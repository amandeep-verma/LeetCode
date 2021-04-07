
public class _278 {
	/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); */

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {

      // solution2
      int start=1;
      int end = n;
      int mid = 0;
      while(start<=end)
      {
          mid = (int)((0.0+start+end)/2.0);
          if(isBadVersion(mid))
              end= mid-1;
          else
              start = mid+1;
      }
      
      if(isBadVersion(start))
          return start;
      else
          return start-1;
      
      // solution1
//       if(isBadVersion(1))
//           return 1;
      
//       int start=2;
//       int end = n;
//       int mid = 0;
//       while(start<=end)
//       {
//           mid = (int)((0.0+start+end)/2.0);
//           //System.out.println(start+" "+mid+" "+end);
//           if(isBadVersion(mid))
//           {
//               if(!isBadVersion(mid-1))
//                   return mid;
//               end= mid-1;
//           }
//           else
//           {
//               start=mid+1;
//           }
//       }
      
//       return mid+1;
      
      
      // solution0 - brute force -- Time Limit Exceeded
      
      // for(int i =1; i<=n;i++)
      // {
      //     if(isBadVersion(i))
      //         return i;
      // }
      // return -1;
  }
}
}
