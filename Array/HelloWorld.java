public class MyClass {
   public static void main(String args[]){
       int[] input = {  1, 2, 3, 4,6};
     
       	for(int i = 0; i < input.length/2; i++){
       	    int temp = input[i];
       	    input[i] = input[input.length-1];
       	    input[input.length-1] = temp;
       	}
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < input.length; k++) {
            System.out.print(input[k]+" ");
        }
      
    }

}
