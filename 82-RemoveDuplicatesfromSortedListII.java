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
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = null, prev = null, curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == curr.val) {
                int value = curr.val;
                while (curr != null && curr.val == value)
                    curr = curr.next;
                
                curr = deleteDuplicates(curr);

                if(curr == null && newHead == null && prev == null)
                    return null;

                if(curr == null) {
                    if(prev != null)
                        prev.next = null;
                } else if (newHead == null)
                    newHead = curr;
                else
                    prev.next = curr;
            } else {
                if (newHead == null)
                    newHead = curr;
                prev = curr;
                curr = curr.next;
            }
        }

        return newHead;
    }
} 
