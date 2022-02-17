import java.util.Arrays;
public class MyClass {
    
  public static int findMax(int[] nums)
    {   //we have to search min in our array
        int min = Integer.MAX_VALUE;
        // bought the most expensive stocks
        int bought = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                //we find our min stock
                min = nums[i];
            }else{
                //if we can't find min stock, so our max is the first day we bought and sell it.
                bought = Math.max(bought, nums[i] - min);
            }
        }
        return bought;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int arr[] = { 7,6,4,3,1,6};
        int n = arr.length;
 
        // Function calling
       findMax(arr);
       System.out.println("Max profit we made is: " + findMax(arr));
    }


}
