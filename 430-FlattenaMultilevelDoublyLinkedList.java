class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return null;

        if(head.child == null) {
            flatten(head.next);
        } else {
            Node temp = flatten(head.child);
            head.child = null;
            Node headNext = head.next;
            head.next = temp;
            temp.prev = head;

            Node curr = temp;
            while(curr.next != null)
                curr = curr.next;
            
            temp = flatten(headNext);
            curr.next = temp;
            if(temp != null)
                temp.prev = curr;
        }

        return head;
    }
}
