
public class _92 {
	class Solution {
	    
	    public ListNode reverseList(ListNode head) {
	        
	        // Solution1 - iteratively - in space reverse linked list
	        ListNode runner = head;
	        head = null;
	        
	        while(runner!=null)
	        {
	            ListNode current = runner;
	            runner = runner.next;
	            current.next = head;
	            head = current;
	        }
	        
	        return head;
	    }
	    
	    public ListNode reverseBetween(ListNode head, int m, int n) {
	        
	        if(head == null || head.next == null || n-m ==0)
	            return head;
	        
	        ListNode dummy= new ListNode();
	        dummy.next = head;
	        
	        ListNode runner = dummy;
	        ListNode tailOfFirst;
	        ListNode toBeReversed;
	        ListNode headOfRem;
	        
	        int i;
	        for(i = 1; i<m;i++)
	        {
	            runner = runner.next;
	        }
	        
	        tailOfFirst=runner;
	        toBeReversed = tailOfFirst.next;
	        
	        for(; i<=n ; i++)
	        {
	            runner = runner.next;
	        }
	        
	        headOfRem = runner.next;
	        runner.next = null;
	        
	        tailOfFirst.next = reverseList(toBeReversed);
	        
	        while(tailOfFirst.next!=null)
	        {
	            tailOfFirst=tailOfFirst.next;
	        }
	        
	        tailOfFirst.next = headOfRem;
	        
	        return dummy.next;
	        
	    }
	}
}
