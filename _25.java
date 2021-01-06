
public class _25 {
	class Solution {
	    
        // reverse the LinkedList
        public ListNode reverseList(ListNode head) {
        
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
    
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode fakeH = new ListNode();
        fakeH.next = head;
        
        ListNode runner = head;
        
        ListNode tailOfFirst = fakeH;
        ListNode toBeReversed;
        ListNode headOfRem;
        
        while(runner!=null)
        {
            
            toBeReversed = runner;
            for(int i =1; i<k; i++)
            {
                if(runner.next == null)
                    return fakeH.next;
                
                runner = runner.next;
            }

            headOfRem = runner.next;
            
            runner.next =null;
            
            tailOfFirst.next = reverseList(toBeReversed);
            for(int i =0; i<k; i++)
            {
                tailOfFirst = tailOfFirst.next;
            }
            tailOfFirst.next = headOfRem;
            runner = tailOfFirst.next;
            
        }
        return fakeH.next;
        
    }
}
}
