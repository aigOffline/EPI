class Solution
{
   //Function to sort a linked list of 0s, 1s and 2s.
   static Node segregate(Node head)
   {
       Node temp=head;
       int count0=0;
       int count1=0;
       int count2=0;
       
       while(temp!=null)
       {
           if(temp.data==0)
           {
               count0++;
           }
           if(temp.data==1)
           {
               count1++;
           }
           if(temp.data==2)
           {
               count2++;
           }
           temp=temp.next;
       }
       Node curr=head;
       while(count0-->0)
       {
           curr.data=0;
           curr=curr.next;
       }
        while(count1-->0)
       {
           curr.data=1;
           curr=curr.next;
       }
        while(count2-->0)
       {
           curr.data=2;
           curr=curr.next;
       }
       
       return head;
       
   }
}


