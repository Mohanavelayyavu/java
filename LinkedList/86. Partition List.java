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
    public ListNode partition(ListNode head, int x) {
        ListNode v = head;
        if(head == null)
        {
            return null;
        }
        ListNode s = new ListNode(0);
        ListNode b = new ListNode(0);
        ListNode small = s;
        ListNode big = b;

        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                small.next = current;
                small = small.next;
            } else {
                big.next = current;
                big = big.next;
            }
            current = current.next;
        }
        big.next = null;
        small.next = b.next;
        return s.next;
    }
}
