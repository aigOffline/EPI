class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    
     {
       head=swap(head);
       Node start=head.next;
       while(start!=null && start.next!=null){
           start.next=swap(start.next);
           start=start.next.next;
       }
       return head;
   }
   public Node swap(Node head){
       if(head.next==null){
           return head;
       }
       Node temp=head;
       Node temp2=head.next;
       Node temp3=head.next.next;
       head=head.next;
       head.next=temp;
       head.next.next=temp3;
       return head;
   }
}

