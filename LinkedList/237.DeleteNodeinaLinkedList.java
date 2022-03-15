//am9634
//Aigerim Madakimova
 public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

