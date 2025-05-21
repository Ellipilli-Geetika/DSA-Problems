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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode mid = findMiddle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        right = sortList(right);
        return sort(left,right);
        
    }

    public ListNode findMiddle(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sort(ListNode left,ListNode right)
    {
        ListNode temp1 = left, temp2 = right;
        ListNode l = new ListNode(1);
        ListNode result = l;
        
        while(temp1 != null && temp2 != null)
        {
            
            if(temp1.val <= temp2.val)
            {
                result.next = temp1;
                temp1 = temp1.next;
            }
            else
            {
                result.next = temp2;
                temp2 = temp2.next;
            }
            result = result.next;
        }

        if(temp1!=null)
        {
            result.next = temp1;

        }
        if(temp2!=null)
        {
            result.next = temp2;

        }
        return l.next;

    }
}