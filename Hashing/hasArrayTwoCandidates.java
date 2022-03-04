
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
            HashMap<Integer,Integer>map=new HashMap<>();
    
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(x-arr[i]))
        {
            return true;
        }
        else
        {
            map.put(arr[i],1);
        }
    }
    return false;
    }
}

