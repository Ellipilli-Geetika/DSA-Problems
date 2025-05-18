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
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            map.put(count,temp.val);
            temp = temp.next;
        }
        
        int i=1,j = count;
        while(i <= j)
        {
            if(map.get(i)!=map.get(j))
                return false;
            i++;
            j--;
        }
        return true;


        

        
    }
}