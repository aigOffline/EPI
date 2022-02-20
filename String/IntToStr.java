import java.util.*;
import java.util.Arrays;
public class MyClass {

    static void IntToStr(int num)
    { 
    
    String str = String.valueOf(num);
    System.out.println("With valueOf method: string = " + str);

 //Method 2
    //int number = -1234; 
    // String str = String.format("%d", num);
    // System.out.println("With format method: string = " + str);
    }
    public static void main(String[] args)
    {
    String haystack = "hello";
    int n = -1234;
    IntToStr(n);
    }
}

