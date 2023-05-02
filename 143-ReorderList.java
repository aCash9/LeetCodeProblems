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
    public static ListNode reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode last;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        last = slow;
        slow = slow.next;
        last.next = null;

        ListNode curr = slow, prev = null; 
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp; 
        }
        slow = prev;

        curr = head;
        while(slow != null) {
            ListNode temp1 = curr.next;
            ListNode temp2 = slow.next;

            curr.next = slow;
            slow.next = temp1;
            curr = temp1;
            slow = temp2;
        }
        return head;
    }
}
