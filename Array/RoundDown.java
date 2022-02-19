import java.util.*;
import java.util.Arrays;
public class MyClass {

static int round(int n)
    {
        //472
        //delete the last one (n/10)
        //and (472*10) = 4720 
    int a = (n / 10) * 10;

        //4730
    int b = (a + 10);
    //4720 - 4727 > 4730- 4727

    return (a - n > b - n )? b : a;
    
    }
     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
         int n = 4727;
         System.out.println(round(n));
    }
}
//4720

    

