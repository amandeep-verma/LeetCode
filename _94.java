
public class _94 {
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
	    
	    public List<Integer> inorderTraversal(TreeNode root) {
	        
	        
	        
	        List<Integer> li = new ArrayList<Integer>();
	        Stack<TreeNode> st = new Stack<TreeNode>();
	        TreeNode runner = root;
	        
	        while(!st.isEmpty()|| runner!=null)
	        {
	            if(runner != null )
	            {
	                st.push(runner);
	                runner = runner.left;
	            } 
	            else
	            {
	                runner = st.pop();
	                li.add(runner.val);
	                runner = runner.right;
	            }
	        }
	        return li;
	            

	        
	        //solution2 -iterative
	        
//	         List<Integer> li = new ArrayList<Integer>();
//	         Stack<TreeNode> st = new Stack<TreeNode>();
//	         TreeNode runner = root;
	        
//	         while(!st.isEmpty() || runner!=null)
//	         {
//	             while(runner!=null)
//	             {
//	                 st.push(runner);
//	                 runner = runner.left;
//	             }

//	             runner = st.pop();
//	             li.add(runner.val);
//	             runner = runner.right;
	            
//	         }
//	         return li;
	        
	        
	        //solution 1 - recursive
	        
//	         List<Integer> li = new ArrayList<Integer>();
//	         if(root ==null)
//	             return li;
//	         li.addAll(inorderTraversal(root.left));
//	         li.add(root.val);
//	         li.addAll(inorderTraversal(root.right));
//	         return li;
	    }
	}
}
