 
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
