   Node reverseList(Node head)
    {
       Node prev = null;
       Node curr = head;
       Node temp = head;
       while(temp != null){
           temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       return prev;
    }
}


