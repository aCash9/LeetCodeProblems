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
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;

        ListNode currO = odd, currE = even, prev = null;

        while (currO != null && currO.next != null && currE != null && currE.next != null) {
            ListNode tempO = currE.next;
            ListNode tempE = tempO.next;

            currO.next = tempO;
            currE.next = tempE;

            prev = currO;
            currO = tempO;
            currE = tempE;
        }

        if (currO != null)
            currO.next = even;
        else
            prev.next = even;

        return odd;
    }
}
