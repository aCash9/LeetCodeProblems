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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode temp = new ListNode((l1.val + l2.val)%10);
        int carry = 0;
        carry = (l1.val + l2.val >= 10) ? 1 : 0;
        ListNode l3 = temp;
        
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            ListNode curr = new ListNode((sum + carry) % 10);

            temp.next = curr;
            temp = curr;
            carry = (sum + carry >= 10) ? 1 : 0;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 == null && l2 == null) {
            if(carry != 0){
                ListNode car = new ListNode(1);
                temp.next = car;
            }
            return reverseList(l3);
        }
        while(l1 != null) {
            ListNode curr = new ListNode((l1.val + carry) % 10);
            temp.next = curr;
            temp = curr;
            carry = (l1.val + carry >= 10) ? 1 : 0;
            l1 = l1.next;
        }
        while(l2 != null) {
            ListNode curr = new ListNode((l2.val + carry) % 10);
            temp.next = curr;
            temp = curr;
            carry = (l2.val + carry >= 10) ? 1 : 0;
            l2 = l2.next;
        }
        
        if(carry != 0){
            ListNode car = new ListNode(1);
            temp.next = car;
        }
        return reverseList(l3);
    }
}
