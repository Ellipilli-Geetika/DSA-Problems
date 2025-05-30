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
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int mid = (count/2) + 1;
        count = 0;
        temp = head;
        while(temp!=null)
        {
            count++;
            if(count == mid)
            {
                
                return temp;
                

            }
            temp = temp.next;
        }
        return null;

        
    }
}