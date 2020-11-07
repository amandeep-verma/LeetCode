
public class _653 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    
	    void addtoList(List<Integer> set,TreeNode root)
	    {
	        if(root == null)
	            return;
	        addtoList(set,root.left);
	        set.add(root.val);
	        addtoList(set,root.right);
	    }
	    
	    public boolean findTarget(TreeNode root, int k) {
	        
	        
	        
	        
	        // Solution 2
	        // adding all elements in of tree in sorted way to an array and convert it to problem 167
	        List<Integer> a = new ArrayList<Integer>();
	        addtoList(a,root);
	        
	        // from here it is problem 167
	        int i=0,j=a.size()-1;
	        while(j>i)
	        {
	            if(a.get(i)+a.get(j)==k)
	            {
	                return true;
	            }
	            else if(a.get(i)+a.get(j)>k)
	            {
	                j--;
	            }
	            else
	            {
	                i++;
	            }
	        }
	        return false;
	        
	        
	        // Solution 1
	        // adding all elements of tree to a list
	        
//	         List<Integer> a = new ArrayList<Integer>();
//	         addtoList(a,root);
//	         for ( int i =0; i<a.size(); i++)
//	         {
//	             int compliment = k - a.get(i) ;
//	             if(a.indexOf(compliment) >=0 && a.indexOf(compliment) !=i )
//	             {
//	                 return true;
//	             }
//	         }
//	         return false;
	    }
	}
}
