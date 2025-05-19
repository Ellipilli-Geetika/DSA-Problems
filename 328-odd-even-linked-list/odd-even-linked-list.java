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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null)
            return head;
        ListNode insertOdd = head;
        ListNode evenHead = head.next;
        ListNode insertEven = head.next;
        
        while( insertEven != null && insertEven.next != null)
        {
            ListNode temp = insertEven.next;
            insertEven.next = insertEven.next.next;
            insertOdd.next = temp;
            insertEven = insertEven.next;
            insertOdd = insertOdd.next;
        }
        insertOdd.next = evenHead;
        return head;

    }
}