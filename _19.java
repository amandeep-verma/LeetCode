
public class _19 {
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
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        // sol2 - one pass
	        ListNode fakeH = new ListNode();
	        fakeH.next = head;
	        ListNode fast = fakeH;
	        ListNode slow = fakeH;
	        while(fast!=null && n-->=0)
	        {
	            fast = fast.next;
	        }
	        
	        while(fast!=null)
	        {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        
	        slow.next = slow.next.next;
	        return fakeH.next;
	        
	        // sol1  - two pass
//	         ListNode fakeH = new ListNode();
//	         fakeH.next = head;
//	         ListNode runner = fakeH;
//	         int size=0;
//	         while(runner!=null)
//	         {
//	             size++;
//	             runner = runner.next;
//	         }
	        
//	         int posToRemove = size - n;
//	         runner = fakeH;
	        
//	         for(int i = 1; i< posToRemove;i++)
//	             runner = runner.next;
	        
//	         runner.next = runner.next.next;
//	         return fakeH.next;
	    }
	}
}
