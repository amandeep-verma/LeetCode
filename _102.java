
public class _102 {
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
	    
	    public void levelOrder(TreeNode root,List<List<Integer>> le, int depth) 
	    {
	        if(root==null)
	            return;
	        
	        if(le.size()<=depth)
	            le.add(new ArrayList<Integer>());
	        
	        le.get(depth).add(root.val);
	        
	        levelOrder(root.left,le,depth+1);
	        levelOrder(root.right,le,depth+1);
	        
	    }
	    
	    
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        
	        // DFS- recursive solution
	        List<List<Integer>> le = new ArrayList<List<Integer>>();
	        levelOrder(root,le,0);
	        return le;
	        
	        // BFS
//	         List<List<Integer>> le = new ArrayList<List<Integer>>();
//	         if(root==null)
//	             return le;
	        
//	         //Queue<TreeNode> qe = new LinkedList<TreeNode>();
//	         Deque<TreeNode> qe = new ArrayDeque<>();
//	         qe.add(root);
	        
//	         while(!qe.isEmpty())
//	         {
//	             int size = qe.size();
//	             List<Integer> tempLe = new ArrayList<Integer>();
//	             for(int i=0;i<size;i++)
//	             {
//	                 TreeNode curr = qe.remove();
//	                 tempLe.add(curr.val);
//	                 if(curr.left!=null) qe.add(curr.left);
//	                 if(curr.right!=null) qe.add(curr.right);
//	             }
//	             le.add(tempLe);
//	         }
//	         return le;
	    }
	}
}
