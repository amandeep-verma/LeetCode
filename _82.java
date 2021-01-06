
public class _82 {
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
	        
	        if( head== null || head.next == null)
	        {
	            return head;
	        }
	        
	        // find right head
	        boolean check = false;
	        ListNode ab = head.next;
	        while(ab.val == head.val)
	        {
	            ab = ab.next;
	            check = true;
	            if(ab == null)
	            {
	                return null;
	            }
	        }
	        if(check)
	        {
	            head = ab;
	            return deleteDuplicates(head);
	        }
	        
	        
	        // modifying the original list itself.
	        ListNode backChecker =head;
	        ListNode runner = head.next;
	        ListNode jumper = head.next;
	        
	        while(runner != null)
	        {
	            jumper = runner.next;
	            boolean flag = false;
	            
	            while (jumper!= null && runner.val == jumper.val )
	            {
	                jumper = jumper.next;
	                flag = true;
	            }
	            if (flag)
	            {
	                backChecker.next = jumper;
	                runner = jumper;
	                continue;
	            }
	            else  // if ( runner.next.val == jumper.val)
	            {
	                backChecker = backChecker.next;
	                runner = backChecker.next;
	            }
	        }
	        
	        return head;
	    }
	}
}
