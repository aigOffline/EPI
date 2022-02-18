import java.util.*;

public class MyClass {
//insert element
    public static int delete(int[] nums, int val){
         
       int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
        
    }
     public static void main (String[] args)
    {  
        int[] arr = {1,2,3,4,5,3,3,6};
        int val = 3;
        int n = arr.length;
        delete(arr, val);
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    
    }
}
