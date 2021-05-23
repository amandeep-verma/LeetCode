
public class _700 {
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
	    
	    public TreeNode inOrder(TreeNode present, int val) {
	        if(present == null)
	            return null;
	        if(present.val == val)
	            return present;
	        else if(present.val>val)
	            return inOrder(present.left,val);
	        else
	            return inOrder(present.right,val);
	        
	    }
	    public TreeNode searchBST(TreeNode root, int val) {
	        TreeNode pointer = inOrder(root,val);
	        return pointer;
	    }
	} 
}
