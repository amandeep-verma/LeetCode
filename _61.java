
public class _61 {

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
	    public ListNode rotateRight(ListNode head, int k) {
	        // Solution5- beats 100%  
	        // move "runner" pointer k nodes ahead of "breaker" pointer
	        // O(k) for k< size of linked list, else O( k + size of linked list )
	        if(head == null || head.next == null) // if list is empty or have just 1 element
	            return head;
	        
	        int size=1;
	        
	        ListNode breaker = head;
	        ListNode runner = head;
	        
	        // makes runner run k nodes ahead of breaker
	        while(runner.next != null && k>=size)
	        {
	            runner = runner.next;
	            size++;
	        }
	        
	        
	        if (runner.next == null) // k >= size of LinkedList
	        {
	            k = k%size;
	            if(k==0)
	                return head;
	            
	            for(int i = 1 ; i< size - k ; i++)
	            {
	                breaker = breaker.next;
	            }
	        }
	        else // k< size of LinkedList
	        {
	            while(runner.next != null)
	            {
	                breaker = breaker.next;
	                runner = runner.next;
	            }
	        }
	        
	        runner.next = head; // makes it circular linked link
	        head = breaker.next;
	        breaker.next = null;
	        return head;
	                
	        
	        // Solution4- beats 100%
	        // doesn't use another ListNode for last 
	        // O( k + size of linked list )
//	         if(head == null || head.next == null) // if list is empty or have just 1 element
//	         {
//	             return head;
//	         }
	        
//	         int size=1;
//	         ListNode runner = head;
//	         while(runner.next != null)
//	         {
//	             runner = runner.next;
//	             size++;
//	         }
//	         k = k%size;
	        
//	         runner.next = head; // makes it circular linked link
	        
//	         for(int i = 0 ; i< size - k ; i++)
//	         {
//	             runner = runner.next;
//	         }
	        
//	         ListNode last = runner.next;
	        
//	         head = runner.next;
//	         runner.next = null;
	        
//	         return head;
	        
	        
	        // Solution3- beats 100%
	        // once we know the size of list, we can simple pick the ListNode from any point.
	        // O ( 2 * size of linked list )
//	         if(head == null || head.next == null) // if list is empty or have just 1 element
//	         {
//	             return head;
//	         }
	        
//	         int size=0;
//	         ListNode runner = head;
//	         while(runner != null)
//	         {
//	             runner = runner.next;
//	             size++;
//	         }
//	         k = k%size;
//	         if(k==0)
//	             return head;
	        
//	         runner = head;
	        
//	         for(int i = 1 ; i< size - k ; i++)
//	         {
//	             runner = runner.next;
//	         }
	        
//	         ListNode last= runner.next;
	        
//	         while(last.next!= null)
//	         {
//	             last = last.next;
//	         }
	        
//	         last.next = head;
//	         head = runner.next;
//	         runner.next = null;
	        
//	         return head;
	        
	        
	        
	        // Solution2  // works but not as fast;
	        // improvisation by reducing down the k to remainder when k divided by size of Linked List

//	         if(head == null || head.next == null) // if list is empty or have just 1 element
//	         {
//	             return head;
//	         }
	        
//	         int size=0;
//	         ListNode runner = head;
//	         while(runner != null)
//	         {
//	             runner = runner.next;
//	             size++;
//	         }
//	         k = k%size;
	        
//	         for(int i =0 ; i<k ; i++)
//	         {
//	             runner = head;
//	             while(runner.next.next != null )
//	             {
//	                 runner = runner.next;
//	             }
//	             runner.next.next = head;
//	             head = runner.next;
//	             runner.next = null;
//	         }
//	         return head;
	        
	        
	        // Solution1  - time limit exceeds
	        // brute force - unnecessarily continue to rotate for k greater than size of LinkedList
//	         if(head == null || head.next == null) // if list is empty or have just 1 element
//	         {
//	             return head;
//	         }
	        
//	         for(int i =0 ; i<k ; i++)
//	         {
//	             ListNode runner = head;
//	             while(runner.next.next != null )
//	             {
//	                 runner = runner.next;
//	             }
//	             runner.next.next = head;
//	             head = runner.next;
//	             runner.next = null;
//	         }
//	         return head;
	    }
	}
}
