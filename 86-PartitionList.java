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
    public static ListNode indexPlacing(ListNode head, ListNode item, int index) {
        ListNode temp = head;
        while (index > 1) {
            temp = temp.next;
            index--;
        }
        ListNode curr = temp.next;
        temp.next = item;
        item.next = curr;
        return head;
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode dummyhead = new ListNode(0);
        int left = 1, right = 1;
        ListNode temp = head;
        while (temp != null) {
            ListNode item = new ListNode(temp.val);
            if (item.val < x) {
                // function call to add in the left
                dummyhead = indexPlacing(dummyhead, item, left);
                left++;
                right += 1;
            } else {
                // function call to add in the rigth
                dummyhead = indexPlacing(dummyhead, item, right);
                right++;
            }
            temp = temp.next;
        }
        return dummyhead.next;
    }
}
