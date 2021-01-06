
public class _206 {
	class Solution {
	    
	    private ListNode reverseList(ListNode head, ListNode revhead) {
	        if(head == null)
	            return revhead;
	        
	        ListNode current = head;
	        head = head.next;
	        current.next = revhead;
	        return reverseList(head, current);
	    }
	    public ListNode reverseList(ListNode head) {
	        
	        // Solution2 - recursively
	        return reverseList(head, null);
	        
	        // Solution1 - iteratively - inpace reverse linked list
//	         ListNode runner = head;
//	         head = null;
	        
//	         while(runner!=null)
//	         {
//	             ListNode current = runner;
//	             runner = runner.next;
//	             current.next = head;
//	             head = current;
//	         }
	        
//	         return head;
	    }
	}
}
