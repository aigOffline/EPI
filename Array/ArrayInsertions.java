import java.util.*;

public class MyClass {
//insert element
     public static void main (String[] args)
    {  
        int[] arr = {1,2,3,5,6,7,8,9};
        int n = arr.length;
        // int i = 5; it is our capacity we need to itirate
        // i >= 3 it is our place we want to insert
        for(int i = 5; i>= 3; i--){
            //we need to shift it
            //since we going from back
            arr[i+1] = arr[i];
        }
        arr[3] = 10;
    
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    
    }
 
}
