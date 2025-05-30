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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null )
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        ListNode Node1 = head;
        ListNode Node2 = reverseList(slow);

        while(Node1 != null && Node2 != null)
        {
            if( Node1.val != Node2.val)
                return false;
            Node1 = Node1.next;
            Node2 = Node2.next;
        }
        return true;


        

        
    }

    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next == null)
            return head;
        ListNode headNode = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;


        
        return headNode;


        
    }
     
}