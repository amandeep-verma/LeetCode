
public class _965 {
	class Solution {
	    
	    public boolean inOrder(TreeNode present, int val) {
	        if(present==null)
	            return true;
	        
	        if(val != present.val)
	            return false;
	        
	        return inOrder(present.left,val) && inOrder(present.right,val);
	        
	    }
	    public boolean isUnivalTree(TreeNode root) {
	        
	        
	        return inOrder(root,root.val);
	        
	    }
	}
}
