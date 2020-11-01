
public class _876 {
	class Solution {
	    public ListNode middleNode(ListNode head) {
	        ListNode pt1 = head;
	        ListNode pt2 = head;
	        while(pt2!=null && pt2.next !=null)
	        {
	            pt2 = pt2.next.next;
	            pt1 = pt1.next;
	        }
	        return pt1;
	    }
	}
}
