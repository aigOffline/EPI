import java.util.*;

public class MyClass {
//insert element
     public static void main (String[] args)
    {  
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
  
        for(int i = 0; i<n-1; i++){
            //we need to shift it
            //since we going from back
            arr[i] = arr[i+1];
        }
        n--;
    
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    
    }
 
}
