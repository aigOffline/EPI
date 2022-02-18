import java.util.*;

public class MyClass {
//insert element
    public static void delete(int[] nums){
         
        int j = 0;
         for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
            }
        
        }
    }
     public static void main (String[] args)
    {  
        int[] arr = {1,0,0,4,5,3,3,6};

        int n = arr.length;
        delete(arr);
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    
    }
 
}
