class Solution{
public:
  int count=0;
void helper(vector<int>&v,int n,int temp,bool flag){
    v.push_back(n);
        if(n==temp){
         count+=1;
         if(count==2)
         return;
        }
        if(n>0){
          if(flag)
          helper(v,n+5,temp,flag);
          else
          helper(v,n-5,temp,flag);
        }
        else if(n<=0){
          flag=true;    
          helper(v,n+5,temp,flag);
        }
        return;
}
    vector<int> pattern(int n){
        // code here
        vector<int>v;
        int temp=n;bool flag=false;
        helper(v,n,temp,flag);
        return v;
    }
};
