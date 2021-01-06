
public class _203 {
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
	    public ListNode removeElements(ListNode head, int val) {
	        
	        // Solution-2 1ms
//	         ListNode fakeHead = new ListNode();
//	         fakeHead.next = head;
	        
//	         ListNode runner = fakeHead;
//	         ListNode checker = runner.next;
	        
//	         while(checker!=null)
//	         {
//	             if(checker.val == val )
//	             {
//	                 checker = checker.next;
//	                 runner.next = checker;
//	                 continue;
//	             }
//	             runner.next = checker;
//	             runner = runner.next;
//	             checker = checker.next;
//	         }
//	         return fakeHead.next;
	        
	        
	        // Solution1 - 0ms
	        ListNode runner = head;
	        
	        // checks for head element == val
	        while(runner!= null && runner.val == val )
	        {
	            runner = runner.next;
	            head = runner;
	        }
	        
	        if (head == null)
	            return head;
	        
	        // checks for element in between == val
	        while(runner.next!=null)
	        {
	            if(runner.next.val == val )
	            {
	                runner.next = runner.next.next;
	                continue;
	            }
	            runner = runner.next;
	        }
	        
	        return head;
	    }
	}
}
