public class MyClass {
    static int[] targetSum(int []a , int target)
    {
        for(int i = 0 ; i < a.length - 1 ; i++)
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[i] + a[j] == target)
                    return new int[]{i, j};
            }
        return new int[]{-1 , -1};
    }
    
    public static void main(String[] args){
    int [] a = {1 , 4 , 5 , 11 , 12};
        int target = 9;
        for(int i: targetSum(a , target)){
             System.out.print(i + " ");
        }
        
     }

}
