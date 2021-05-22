
public class _617 {
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
	    
	    
	    public int value(TreeNode present)
	    {
	        if(present==null)
	            return 0;
	        return present.val;
	    }
	    
	    public TreeNode nextLeft(TreeNode present)
	    {
	        if(present==null)
	            return null;
	        return present.left;
	    }
	    
	    public TreeNode nextRight(TreeNode present)
	    {
	        if(present==null)
	            return null;
	        return present.right;
	    }
	    
	    public TreeNode inOrder1(TreeNode present1, TreeNode present2,TreeNode present3) {

	        if(present1 == null )
	            return present2;
	        if(present2 == null )
	            return present1;
	        present3 = new TreeNode();
	        present3.val = present1.val + present2.val;
	        
	        present3.left = inOrder1(present1.left,present2.left,present3.left);
	        present3.right = inOrder1(present1.right,present2.right,present3.right);
	        
	        return present3;
	        
	    }
	    
	    
	    public void inOrder(TreeNode present1, TreeNode present2,TreeNode present3) {

	        present3.val = (value(present1)+value(present2));
	        
	        if(nextLeft(present1)!=null || nextLeft(present2)!=null)
	        {
	            present3.left = new TreeNode();
	            inOrder(nextLeft(present1),nextLeft(present2),present3.left);
	        }
	        
	        if(nextRight(present1)!=null || nextRight(present2)!=null)
	        {
	            present3.right = new TreeNode();
	            inOrder(nextRight(present1),nextRight(present2),present3.right);
	        }
	        
	    }
	    
	    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	        
	        // Solution3 -
	        if(root2==null)
	            return root1;
	        if(root1==null)
	            return root2;
	        
	        TreeNode curr = new TreeNode();
	        curr.val = root1.val +root2.val;
	        curr.left =  mergeTrees(root1.left,root2.left);
	        curr.right =  mergeTrees(root1.right,root2.right);
	        
	        return curr;
	        
	        
	        
	           // Solution2 -
	        
//	         if(root1==null && root2==null)
//	              return null;
//	         TreeNode newRoot = new TreeNode();
//	         return inOrder1(root1, root2, newRoot);
	        
	        // Solution1 -
	        
//	         if(root1==null && root2==null)
//	              return null;
//	         TreeNode newRoot = new TreeNode();
//	         inOrder(root1, root2, newRoot);
//	         return newRoot;
	    }
	}
}
