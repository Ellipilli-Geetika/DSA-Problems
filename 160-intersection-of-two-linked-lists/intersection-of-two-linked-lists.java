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

        ListNode temp1 = headA, temp2 = headB;
        int count1 = 0,count2 =0;
        while(temp1 != null || temp2  != null)
        {
            if(temp1 != null && temp2!=null)
            {
                temp1 = temp1.next;
                temp2 = temp2.next;
                
            }
            else if(temp1 != null)
            {
                temp1 = temp1.next;
                count1++;
            }
            else
            {
                count2++;
                temp2 = temp2.next;
            }
        }
        if(temp1!=temp2)
            return null;
        temp1 = headA;
        temp2 = headB;
        
        if(count1>count2)
            while(count1!=0)
            {
                temp1 = temp1.next;
                count1--;
            }
        if(count1<count2)
            while(count2!=0)
            {
                temp2 = temp2.next;
                count2--;
            }
        while(temp1 != null || temp2  != null)
        {
            if(temp1==temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    
}