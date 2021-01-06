
public class _328 {
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
	    public ListNode oddEvenList(ListNode head) {
	        
	        // O(size of LinkedList) 
	        
	        // if there are 2 or less Nodes
	        if(head == null || head.next == null || head.next.next ==null )
	            return head;
	            
	        ListNode odd = head;
	        ListNode even = odd.next;
	        ListNode evenheader = even;
	        ListNode runner = even.next;
	        
	        while(runner != null)
	        {
	            odd.next = runner;
	            runner = runner.next;
	            odd = odd.next;
	            
	            if(runner!=null)
	            {
	                even.next = runner;
	                runner = runner.next;
	                even=even.next;
	            }
	        }
	        
	        // linking the last node of odd linkedList to head of even linkedList
	        odd.next = evenheader;
	        even.next = null; // pointing the last node to null
	        
	        return head;
	    }
	}
}
