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
        HashSet<ListNode> set = new HashSet<>();
        while(temp1 != null || temp2  != null)
        {
            if(temp1 != null)
            {
                if(set.contains(temp1))
                    return temp1;
                set.add(temp1);
                temp1 = temp1.next;
                
            }
            if(temp2 != null)
            {
                if(set.contains(temp2))
                    return temp2;
                set.add(temp2);
                temp2 = temp2.next;
            }
        }
        return null;
        
    }
}