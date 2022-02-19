import java.util.*;
import java.util.Arrays;
public class MyClass {
     

     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
   int n=75;
   int rem;
       rem=n%10;
   
   if(rem>5)
   {
     n=n+(10-rem);
   }
   else
   {
    n=n-rem; 
   }
   System.out.println("Result is: "+ n);
  }
    


}
//Result is: 70

