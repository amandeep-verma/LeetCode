
public class _872 {
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
	    
	    public void addLead(TreeNode present, List a)
	    {
	        if(present == null)
	            return;
	        
	        addLead(present.left,a);
	        
	        if(present.left==null && present.right==null)
	            a.add(present.val);
	        
	        addLead(present.right,a);
	        
	    }
	    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
	        
	 
	        
	        // Solution 1
	        List a = new ArrayList();
	        addLead(root1,a);
	        
	        List b = new ArrayList();
	        addLead(root2,b);
	        
	        if(a.size()!=b.size())
	            return false;
	        
	        for(int i =0;i<a.size();i++)
	        {
	            if(a.get(i)!=b.get(i))
	                return false;
	        }
	        return true;
	        
	    }
	}
}
