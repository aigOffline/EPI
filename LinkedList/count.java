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

