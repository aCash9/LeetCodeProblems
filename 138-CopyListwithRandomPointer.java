class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        map.put(head, newHead);
        Node curr = head.next, temp = newHead, prev;
        int index = 0;
        while(curr != null) {
            Node n = new Node(curr.val);
            map.put(curr, n);
            temp.next = n;
            temp = n;
            curr = curr.next;
        }

        curr = head;
        temp = newHead;
        while(curr != null) {
            Node randm = map.get(curr.random);
            temp.random = randm;
            curr = curr.next;
            temp = temp.next;
        }

        return newHead;
    }
}
