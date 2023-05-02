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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = head, end, curr = head, prev = head;
        int count = 0;

        while(curr != null && ++count != left) {
            start = curr;
            curr = curr.next;
        }
        end = curr;
        
        prev = null;
        while(curr != null && count++ != right + 1) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if(left == 1)
            head = prev;
        else
            start.next = prev;

        end.next = curr;

        return head;
    }
}
