
public class _2 {
	class Solution {
		public class ListNode {
			int val;
			ListNode next;
			ListNode() {}
			ListNode(int val) { this.val = val; }
			ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		}

		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode output = new ListNode();
			ListNode p = l1 ;
			ListNode q = l2 ;
			ListNode current = output;
			int carry = 0;

			while (p != null && q != null)
			{
				int sum = p.val + q.val + carry;
				if ( sum > 9)
				{
					carry = 1;
					sum = sum % 10;
				}
				else
					carry = 0;

				current.next = new ListNode(sum);
				p = p.next;
				q = q.next;
				current = current.next;
			}

			if(p == null && q == null)
			{

			}
			else
			{
				if (p == null)  
				{
					while ( q != null)
					{
						int sum =  q.val + carry;
						if ( sum > 9)
						{
							carry = 1;
							sum = sum % 10;
						}
						else
							carry = 0;
						current.next = new ListNode(sum);
						q = q.next;
						current = current.next;
					}
				}
				else
				{
					while ( p != null)
					{
						int sum =  p.val + carry;
						if ( sum > 9)
						{
							carry = 1;
							sum = sum % 10;
						}
						else
							carry = 0;
						current.next = new ListNode(sum);
						p = p.next;
						current = current.next;
					}
				}
			}

			if (carry > 0) 
				current.next = new ListNode(carry);

			return output.next;
		}
	}
}
