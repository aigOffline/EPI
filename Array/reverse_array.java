import java.util.Arrays;
public class MyClass {
  
   public static void main(String args[]){
       int[] input = {  1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
       int[] count = new int[input.length];
       int[] register = new int[input.length];
       	for(int i = 0; i < input.length/2; i++){
		    int temp = input[i];
		    input[i] = input[input.length-i-1];
		    input[input.length-i-1] = temp;
		}
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < input.length; k++) {
            System.out.print(input[k]+" ");
        }
      
    }
}

