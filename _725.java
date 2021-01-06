
public class _725 {
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
		public ListNode[] splitListToParts(ListNode root, int k) {

	        // O(2* length of Linked List)
			

			int size = 0;
			ListNode runner = root;
			while(runner != null)
			{
				runner = runner.next;
				size++;
			}

	        int blockSize = size/k;
	        int totalBigBlocks = size % k;

	        int i=0;
	        ListNode[] a = new ListNode[k];
	        for(i=0; i< totalBigBlocks; i++)
	        {
	            a[i] = root;
	            runner = a[i];

	            for(int j=1; j< blockSize+1; j++)
	            {
	                root = root.next;
	                runner = root;
	            }
	            root = root.next;
	            runner.next =  null;
	        }

	        for(; i< k && root != null ; i++)
	        {
	            a[i] = root;
	            runner = a[i];

	            for(int j=1; j< blockSize; j++)
	            {
	                root = root.next;
	                runner = root;
	            }
	            root = root.next;
	            runner.next =  null;
	        }
			return a;
		}
	}
}
