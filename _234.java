
public class _234 {
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
	    public boolean isPalindrome(ListNode head) {
	        
	        
	        // O(n) time and O(1) space 
	        if(head==null || head.next==null)
	            return true;
	        
	        ListNode runner = head;
	        ListNode midpoint = head;
	        
	        while(runner!=null && runner.next!=null )
	        {
	            runner=runner.next.next;
	            midpoint=midpoint.next;
	        }
	        
	        if(runner!=null)
	            midpoint=midpoint.next;
	        
	        
	        runner = midpoint;
	        ListNode rhead = null;
	        
	        while(runner!=null)
	        {
	            ListNode current = runner;
	            runner = runner.next;
	            current.next = rhead;
	            rhead = current;
	        }
	        
	        while(rhead!=null)
	        {
	            if(rhead.val != head.val)
	            {
	                return false;
	            }
	            rhead = rhead.next;
	            head = head.next;
	        }
	        return true;
	        
	        
	        // Solution 0 - adding List to a arraylist
//	         ArrayList<Integer> bc = new ArrayList<Integer>();
//	         ListNode runner = head;
//	         while(runner != null)
//	         {
//	             bc.add(runner.val);
//	             runner = runner.next;
//	         }
	        
//	         int last = bc.size()-1;
	        
//	         for(int i =0 ; i< bc.size()/2; i++)
//	         {
//	             if ( bc.get(i).intValue() != bc.get(last).intValue())
//	                 return false;
//	             last--;
//	         }
//	         return true;
	    }
	}
}
