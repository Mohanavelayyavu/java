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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
        {
            return null;
        }
        int l =1;
        ListNode v = head;
        while(v.next!= null)
        {
            l++;
            v = v.next;
        }
        int p = k % l;
        if(p==0)
        {
            return head;
        }
        
        ListNode current = head;
        for (int i = 0; i < l - p - 1; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;
        v.next = head;
        return newHead;

    }
}

