/*
Input:
LinkedList: 1->2->3->4->5
Output: 1 3 5 2 4 
Explanation: 
Odd elements are 1, 3, 5 and even elements are
2, 4. Hence, resultant linked list is
â€‹1->3->5->2->4.
*/
void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
    Node even = head.next;
    Node odd = head;
    Node ohead = head.next;
    
    while(even != null && even.next != null){
        odd.next = even.next;
        even.next = even.next.next;
        odd = odd.next;
        even = even.next;
    }
        odd.next = ohead;
     }

