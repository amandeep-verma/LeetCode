
public class _145 {
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
	    public List<Integer> postorderTraversal(TreeNode root) {
	        
	        // Using just 1 stack- The trick is using linkedlist
	        LinkedList<Integer> li = new LinkedList<Integer>();
	        if(root==null)
	            return li;
	        Stack<TreeNode> st1 = new Stack<TreeNode>();
	        st1.push(root);
	        
	        while(!st1.isEmpty())
	        {
	            TreeNode curr = st1.pop();
	            li.addFirst(curr.val);
	            if(curr.left!=null)
	                st1.push(curr.left);
	            if(curr.right!=null)
	                st1.push(curr.right);
	        }
	        
	        return li;
	        
	        
	        
	        //solution 2 - iterative
//	         List<Integer> li = new ArrayList<Integer>();
//	         if(root==null)
//	             return li;
//	         Stack<TreeNode> st1 = new Stack<TreeNode>();
//	         Stack<TreeNode> st2 = new Stack<TreeNode>();
//	         st1.push(root);
	        
//	         while(!st1.isEmpty())
//	         {
//	             TreeNode curr = st1.pop();
//	             st2.push(curr);
//	             if(curr.left!=null)
//	                 st1.push(curr.left);
//	             if(curr.right!=null)
//	                 st1.push(curr.right);
//	         }
	        
//	         while(!st2.isEmpty())
//	             li.add(st2.pop().val);
	        
//	         return li;
	        
	        
	        
	        // self - trial
//	         TreeNode runner = root;
	        
//	         while(!st.isEmpty() || runner!=null)
//	         {
//	             while(runner!=null)
//	             {
//	                 st.push(runner);
//	                 runner = runner.left;
//	             }

//	             runner = st.pop();
//	             st.push(runner);
//	             li.add(runner.val);
//	             runner = runner.right;
	            
//	         }
//	         return li;
	        
	        
	        
	        //solution 1 - recursive

//	          List<Integer> li = new ArrayList<Integer>();
//	          if(root ==null)
//	              return li;
//	          li.addAll(postorderTraversal(root.left));
//	          li.addAll(postorderTraversal(root.right));
//	          li.add(root.val);
//	          return li;
	        
	    }
	}
}
