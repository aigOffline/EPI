import java.util.Arrays;
public class MyClass {
   public static boolean dub_check(int input[]){
       
       Arrays.sort(input);
      for(int i = 0; i < input.length-1; i++){
          if(input[i] == input[i+1])
          return true;
      } 
      return false;
        }
   
   public static void main(String args[]){
       int[] input = {  2, 3, 5, 7, 9,9 };
       System.out.print(dub_check(input));
      
    }
}
