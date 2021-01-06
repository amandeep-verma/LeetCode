
public class _24 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode swapPairs(ListNode head) {
	        
	        
	        // Solution 2- swapping Nodes
	        ListNode fakeHead = new ListNode();
	        fakeHead.next = head;
	        ListNode runner = head;
	        ListNode evenPrev = fakeHead;
	        
	        while(runner!=null)
	        {
	            if(runner.next!=null)
	            {
	                evenPrev.next = runner.next;
	                runner.next = runner.next.next;
	                evenPrev.next.next = runner;
	                evenPrev = runner;
	            }
	            else
	                break;
	            
	            runner = runner.next;
	        }
	        
	        return fakeHead.next;
	        
	        // Solution 1- instead of swapping Node, just swap the values
//	         ListNode runner = head;
	        
//	         while(runner!=null)
//	         {
//	             if(runner.next!=null)
//	             {
//	                 int temp = runner.val;
//	                 runner.val = runner.next.val;
//	                 runner.next.val = temp;
//	             }
//	             else
//	                 break;
	            
//	             runner = runner.next.next;
//	         }
	        
//	         return head;
	        
	    }
	}
}
