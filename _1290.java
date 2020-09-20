class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class _1290 {

	public static int getDecimalValue(ListNode head) {

		// Solution 4
		int num = 0;
		while (head != null) {
			num = (num << 1) | head.val;
			head = head.next;
		}
		return num;

		// Solution 3
//		int num = 0;
//		while(head != null)
//		{
//			num = num * 2 + head.val ;
//			head=head.next;
//		}
//		return num;

		// Solution 2
//		int size =0;
//		ListNode curr = head;
//		while(head != null)
//		{
//			size++;
//			head=head.next;
//		}
//		int res=0;
//		for (int i =size-1; i>=0;i--)
//		{
//			if ( curr.val == 1)
//			{
//				res= res+ (int)Math.pow(2,i);
//			}
//			curr = curr.next;
//		}
//		return res;

		// Solution 1
//		Stack<Integer> st = new Stack();
//		while(head != null)
//		{
//			st.add(head.val);
//			head=head.next;
//		}
//		int res=0;
//		int size=st.size();
//		for (int i =0; i<size;i++)
//		{
//			if ( st.pop() == 1)
//			{
//				res= res+ (int)Math.pow(2,i);
//			}
//		}
//		return res;
	}

	public static void main(String[] args) {

		int[] a = { 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 };
		// int[] a = {1, 0, 1};
		// int[] b = { 2, 2 };

		ListNode head = null;
		ListNode last = head;
		for (int i = 0; i < a.length; i++) {
			ListNode newLast = new ListNode(a[i]);
			if (head == null) {
				head = newLast;
				last = newLast;
			} else {
				last.next = newLast;
				last = newLast;
			}
		}

		System.out.println("res  " + getDecimalValue(head));
	}

}
