class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        if(head == null || head.next == null)
            return true;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        ListNode prev = null;
        while(slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        ListNode curr = head;
        while(prev != null) {
            if(prev.val != curr.val)
                return false;

            curr = curr.next;
            prev = prev.next;
        }

        return true;
    }
}
