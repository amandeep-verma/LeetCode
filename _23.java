
public class _23 {
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
	    
	    public int size(ListNode l1){
	        int size=0;
	        ListNode head = new ListNode();
	        head.next = l1;
	        ListNode runner = head;
	        while(runner.next!=null)
	        {
	            size++;
	            runner = runner.next;
	        }
	        return size;
	    }
	    
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        ListNode head = new ListNode();
	        head.next = l1;
	        ListNode head2 = new ListNode();
	        head2.next = l2;
	        
	        ListNode runner = head;
	        ListNode runner2 = head2;
	        
	        while(runner.next!=null && runner2.next!=null)
	        {
	            if(runner.next.val > runner2.next.val)
	            {
	                ListNode temp = runner2.next;
	                runner2.next = runner2.next.next;
	                temp.next = runner.next;
	                runner.next = temp;
	            }
	            runner = runner.next;
	        }
	        if(runner2.next!=null)
	            runner.next = runner2.next;
	        
	        return head.next;       
	    }
	 
	    // public int minIndex(LinkedList<ListNode> p)
	    // {
	    //     int min=-1;
	    //     int index=-1;
	    //     for(int i =0 ; i<p.size(); i++)
	    //     {
	    //         if(p.get(i).size()<min)
	    //         {
	    //             min = p.get(i).size();
	    //             index=i;
	    //         }
	    //     }
	    //     return index;
	    // }
	    public ListNode mergeKLists(ListNode[] lists) {
	        
	        // Solution 1
	        if(lists.length == 0)
	            return new ListNode().next;
	        else if(lists.length == 1)
	            return lists[0];
	        
	      
//	         ListNode resultant = lists[0];
//	         for(int i =1; i<lists.length ;i++)
//	              resultant = mergeTwoLists(resultant, lists[i]);
	        
//	         return resultant;
	        
	        
	        //Solution2 -- Using heap 
	        
	        Queue<ListNode> pq = new PriorityQueue<>((a, b) -> 
	        size(a) - size(b));
	        
	        for(ListNode l:lists)
	        {
	            if(l!=null)
	                pq.add(l);
	        }
	        
	        ListNode resultant =lists[0];
	        if(pq.size()==0)
	            return resultant;  
	        if(pq.size()==1)
	            return pq.poll();

	        while(pq.size()>1)
	        {
	            resultant = mergeTwoLists(pq.poll(),pq.poll());
	            pq.add(resultant);
	        }
	        return resultant;               
	    }
	}
}
