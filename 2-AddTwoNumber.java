public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode curr = l3;
        int carry = 0 ;
        while(l1!=null || l2!=null){
            int value1 = (l1!=null) ? l1.val : 0;
            int value2 = (l2!=null) ? l2.val : 0;

            int sum = value1 + value2 + carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            curr.next = newNode;

            curr=curr.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry>0){
            ListNode newNode = new ListNode(carry);
            curr.next=newNode;
            curr=curr.next;
        }
        return l3.next;
    }
