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
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode dummyhead = new ListNode(0);
        ListNode temp = head;
        ListNode left = dummyhead, right = dummyhead;
        while (temp != null) {
            ListNode item = new ListNode(temp.val);
            if (item.val < x) {
                ListNode curr = left.next;
                left.next = item;
                item.next = curr;
                left = left.next;
                right = (right.next)!=null?right.next:right;
            } else {
                ListNode curr = right.next;
                right.next = item;
                item.next = curr;
                right = right.next;
            }
            temp = temp.next;
        }
        return dummyhead.next;
    }
}
