
public class _83 {
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
	    public ListNode deleteDuplicates(ListNode head) {
	        
	        if ( head == null)
	        {
	            return null;
	        }
	        
	        // modifying the original list itself.
	        ListNode backChecker =head;
	        ListNode runner = head.next;
	        
	        while(runner != null )
	        {
	            if( runner.val == backChecker.val )
	            {
	                runner = runner.next;
	            }
	            else
	            {
	                backChecker.next = runner;
	                backChecker = runner;
	                runner = runner.next;
	            }
	        }
	        backChecker.next = null;
	        return head;
	    }
	}
}
