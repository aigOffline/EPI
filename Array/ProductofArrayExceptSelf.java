
import java.util.*;

public class MyClass {
    


  public static int[] productExceptSelf(int nums[], int n)
    {
        int[] ans = new int[n];
    /* Construct the left array */
    /* Construct the product array using
        left[] */
        for(int i= 0, left = 1; i<n; i++){
            ans[i] = left;
            left *= nums[i];
        }
        /* Construct the right array */
        /* Construct the product array using
        right[] */
        for(int i =n-1, right = 1; i >= 0; i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
 
    // Driver Code
    public static void main(String args[])
        
    {
        int n = 5;
        int[] array = { 10, 3, 5, 6, 2 };
 
    
        int[] ans = new int[n];
    
       ans = productExceptSelf(array, n);

     for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}


