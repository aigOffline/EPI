Node ans=null;
      Node node=null;
       while(p1!=null||p2!=null){
       if(p1!=null&&p2!=null){
           if(p1.pow==p2.pow){
               if(ans==null){
                   ans=new Node(p1.coeff+p2.coeff,p2.pow);
                   node=ans;
               }
               else{
                   node.next= new Node(p1.coeff+p2.coeff,p2.pow);
                   node=node.next;
               }
               p1=p1.next;
               p2=p2.next;
           }
           else if(p1.pow>p2.pow){
               if(ans==null){
                   ans= new Node(p1.coeff,p1.pow);
                   node=ans;
               }
               else{
               node.next=new Node(p1.coeff,p1.pow);
               node=node.next;
               }
               p1=p1.next;
           }
           else{
               if(ans==null){
                   ans= new Node(p2.coeff,p2.pow);
                   node=ans;
               }
               else{
               node.next=new Node(p2.coeff,p2.pow);
               node=node.next;
               }
               p2=p2.next;
           
           }
       }
           else if(p1!=null&&p2==null){
               if(ans==null){
                   ans=new Node(p1.coeff,p1.pow);
                   node=ans;
               }
               else{
                   node.next= new Node(p1.coeff,p1.pow);
                   node=node.next;
               }
               p1=p1.next;
           }
           else if(p1==null&&p2!=null){
               if(ans==null){
                   ans=new Node(p2.coeff,p2.pow);
                   node=ans;
               }
               else{
                   node.next= new Node(p2.coeff,p2.pow);
                   node=node.next;
               }
               p2=p2.next;
           }
       }
       
      return ans;


