
class LinkedList{
 Node head;
 static class Node{
  int data;
  Node next;
  Node(int d){
   this.data = d;
   next = null;
  }
  }
 public static void printList(){
  Node n = head;
  while(n!= null){
   System.out.println(n.data + " ");
   n = next.data;
  }
 }
 public static void main(String[] args){
  LinkedList llist = new LinkedList();
  llist.head = new Node(1);
  llist.second = new Node(2);
   llist.third = new  Node(3);
  llist.head.next = second;
  second.next = third;
  llist.printList();
 }
}
========================================================== 
void display(Node head)
   {
       while(head!=null)
       {
           System.out.print(head.data+" ");
           head=head.next;
       }
   }

class Solution
{
    public:
    //Function to count nodes of a linked list.
    int getCount(struct Node* head){
    
      int count=0;
while(head){
    head=head->next;
    count++;

}
return count;
