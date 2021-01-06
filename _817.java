
public class _817 {
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
	    public int numComponents(ListNode head, int[] G) {
	        
	        
	        // Sol 3 , creating a bucket
	        boolean[] a = new boolean[10001];
	        for(int elem:G)
	            a[elem] = true;
	        
	        ListNode runner = head;
	        int count=0;
	        while(runner!=null)
	        {
	            if(a[runner.val])
	            {
	                count++;
	                while(runner.next!=null)
	                {
	                    if(!a[runner.next.val])
	                        break;
	                    runner = runner.next;
	                }
	            }
	            runner = runner.next;
	        }
	        return count;
	        
	        
	        // Sol-2  , adding the elements of G to a hashset
//	         HashSet<Integer> a = new HashSet<Integer>();
//	         for(int element:G)
//	             a.add(element);
	        
	        
//	         ListNode runner = head;
//	         int count=0;
//	         while(runner!=null)
//	         {
//	             if(a.contains(runner.val))
//	             {
//	                 count++;
//	                 while(runner.next!=null)
//	                 {
//	                     if(!a.contains(runner.next.val))
//	                         break;
//	                     runner = runner.next;
//	                 }
//	             }
//	             runner = runner.next;
//	         }
//	         return count;
	        
	        // Sol-1 -O(nlogn) sorting the array G 
//	         Arrays.sort(G);
//	         ListNode runner = head;
	        
//	         int size=0;
//	         while(runner!=null)
//	         {
//	             if(Arrays.binarySearch(G,runner.val)>=0)
//	             {
//	                 size++;
//	                 while(runner.next!=null)
//	                 {
//	                     if(Arrays.binarySearch(G,runner.next.val)<0)
//	                         break;
//	                     runner = runner.next;
//	                 }
//	             }
//	             runner = runner.next;
//	         }
//	         return size;
	    }
	}
}
