//am9634
import java.util.Arrays;
public class MyClass {
   public static int missing(int arr[]){
       Arrays.sort(arr);
       //1,2,2,4,4,5
       //0,1,2,3,4,5
       int miss = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] != i+1){
               miss = i+1;
               break;
           }
       }
       return miss;
       
   }
   public static void main(String args[]){
       int[] arr = {1,2,4,5,2,4};
       System.out.println("missing n: "+ missing(arr)); //ty tut sdelala owibku
       
   }
}
