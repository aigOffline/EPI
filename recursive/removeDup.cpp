class Solution{
public:
    string remove(string s){
             // code here
        string res="";
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            while(s[i]==s[i+1] || s[i]==s[i-1])
            {
                flag=1;
                i++;
            }
            if(i<s.length())
            {
                res+=s[i];
            }
            
            
        }
        if(flag==0)
        {
            return res;
        }
        return remove(res);
    }
};

