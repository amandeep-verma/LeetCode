
public class _21 {

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
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        // Solution 3 // recursion 
	        
	        if(l1 == null)
	            return l2;
	        if(l2 == null)
	            return l1;
	        
	        if(l1.val < l2.val)
	        {
	            l1.next = mergeTwoLists(l1.next,l2);
	            return l1;
	        }
	        else
	        {
	            l2.next = mergeTwoLists(l1,l2.next);
	            return l2;
	        }
	        
	        // Solution 2
//	         ListNode res = new ListNode(0);
//	         ListNode l1p = l1;
//	         ListNode l2p = l2;
//	         ListNode resp = res;
	        
//	         while (l1p != null && l2p != null  )
//	         {
//	             if ( l1p.val < l2p.val)
//	             {
//	                 res.next = l1p;
//	                 l1p = l1p.next;
//	             }
//	             else
//	             {
//	                 res.next = l2p;
//	                 l2p = l2p.next;
//	             }
//	             res = res.next;
//	         }
	        
//	         res.next = l1p == null ? l2p : l1p;
//	         return resp.next;
	        
	        // Solution 1
	        
//	         if(l2 == null)
//	             return l1;
//	         if(l1 == null)
//	             return l2;
	        
//	         ListNode resp = new ListNode();
//	         ListNode l1p = l1;
//	         ListNode l2p = l2;
//	         ListNode res = resp;
	        
//	         while (l1p != null && l2p != null  )
//	         {
//	             if ( l1p.val < l2p.val)
//	             {
//	                 resp.val = l1p.val;
//	                 l1p = l1p.next;
//	             }
//	             else
//	             {
//	                 resp.val = l2p.val;
//	                 l2p = l2p.next;
//	             }
//	             resp.next =  new ListNode();
//	             resp = resp.next;
//	         }
	        
//	         if( l1p == null)
//	         {
//	             resp.val = l2p.val;
//	             resp.next = l2p.next;
//	         }
//	         else
//	         {
//	             resp.val = l1p.val;
//	             resp.next = l1p.next;
//	         }
	        
//	         return res;
	    }
	}
	
}
