class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     //check for null base case
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     //iterate
     //helpers
     Node dummy = new Node(0);
     Node temp = dummy;
     while(head1 != null && head2 != null){
         if(head1.data < head2.data){
             dummy.next = head1;
             head1 = head1.next;
         }else{
             dummy.next = head2;
             head2 = head2.next;
         }
         dummy = dummy.next;
     }
     if(head1 != null) dummy.next = head1;
     if(head2 != null) dummy.next = head2;
     return temp.next;
   } 
}

