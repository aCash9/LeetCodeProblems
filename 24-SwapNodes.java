class Solution {
    public static ListNode reorder(ListNode head, int counter) {
        if (head == null || head.next == null)
            return head;

        ListNode newNode = reorder(head.next, ++counter);
        if (counter % 2 != 0) {
            ListNode temp = head;
            head=newNode;
            ListNode curr = newNode.next;
            newNode.next = temp;
            temp.next = curr;
        }
        else 
            head.next = newNode;
        
        return head;
    }

    public static ListNode swapPairs(ListNode head) {
        head = reorder(head, 0);
        return head;
    }
}
