import java.util.Arrays;
public class MyClass {
  
   public static void main(String args[]){
       int[] input = {  1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
       int[] count = new int[input.length];
       int[] register = new int[input.length];
        for(int x : input){
            count[x] = 1;
        }
        for(int i =1; i < count.length; i++){
            if(count[i] == 0)
            System.out.println(i);
        }
       
      
    }
}
