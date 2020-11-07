
public class _160 {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        
	        // go through both linked list and find their size. 
	        // Find the size of smaller one. tempPointer = lengthOfBigger - lengthOfSmaller
	        // now run pointers from  tempPointer on the bigger array and head of smaller array. Kept comparing the pointers and incrementing them one by one, if they intersect you ll have them equal.
	        
	        ListNode ptA = headA;
	        int sizeA=0;
	        ListNode ptB = headB;
	        int sizeB=0;
	        while( ptA != null)
	        {
	            sizeA++;
	            ptA = ptA.next;
	        }
	        while( ptB != null)
	        {
	            sizeB++;
	            ptB = ptB.next;
	        }
	        
	        ptA = headA;
	        ptB = headB;
	        int beginPointer = sizeA - sizeB;
	        
	        if (sizeA<sizeB)
	        {
	            ptA = headB;
	            ptB = headA;
	            beginPointer = sizeB - sizeA;
	        }
	        
	        for(int i =0; i<beginPointer; i++)
	        {
	            ptA=ptA.next;
	        }
	        
	        while(ptA != null)
	        {
	            if(ptA==ptB)
	                return ptA;
	            ptA = ptA.next;
	            ptB = ptB.next;
	        }
	            
	        return null;  
	        
	        
	        // Brute Force 
//	         ListNode ptA = headA;
//	         ListNode ptB;
//	         while (ptA != null)
//	         {
//	             ptB = headB;
//	             while(ptB != null)
//	             {
//	                 if ( ptA == ptB)
//	                 {
//	                     return ptA;
//	                 }
//	                 ptB = ptB.next;
//	             }
//	             ptA = ptA.next;
//	         }
	        
//	         return null;         
	    }
	}
}
