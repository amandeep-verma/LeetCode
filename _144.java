
public class _144 {
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
	    public void preorderTraversal(TreeNode root, List<Integer> li) 
	    {
	        if(root ==null)
	            return;
	        
	        li.add(root.val);
	        preorderTraversal(root.left, li);
	        
	        preorderTraversal(root.right, li);
	        
	    }
	    
	    public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> li = new ArrayList<Integer>();
	        preorderTraversal(root, li);
	        return li;
	        
	    }
	}
}
