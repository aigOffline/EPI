import java.util.*;

public class MyClass {
//insert element
     public static void main (String[] args)
    {  
        int[] arr = {1,0,2,3,0,4,5,0};
        int n = arr.length-1;
        int index = 0;
   
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length-1; j> i; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
                
            
        }
        
    
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] + " ");
        }
    
    }
 
}

