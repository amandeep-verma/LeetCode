

public class _189 {

	public static void rotate(int[] nums, int k) {
        // Solution 2, but not in-place
        
      int[] out = new int[nums.length];
      int i;
      int j=0;
      int rot_turn = nums.length-k;
      if (k >= nums.length-1)
      {
          rot_turn = nums.length - (k % nums.length);
      }
      for( i = rot_turn; i < nums.length ; i++)
      {
          out[j++]=nums[i];
      }
     
      for (i=0; i<rot_turn ;i++)
      {
          out[j++]=nums[i];
      }
     
      for (i=0; i<nums.length ; i++)
      {
          nums[i] = out[i];
      }
     
     
     //Solution 1 - Brute force
     
//      if (k >= nums.length-1)
//      {
//          k= (k % nums.length);
//      }
     
//      int temp;
//      for ( int i = 1 ;i <= k ;i++)
//      {
//          temp = nums[nums.length-1];
//          for ( int j = nums.length-1; j > 0; j--)
//          {
//              nums[j]= nums[j-1];
//          }
//          nums[0]= temp;
//      }
    }
	
	public static void main(String[] args) {
	}
}
