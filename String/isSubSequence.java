import java.util.*;
import java.util.Arrays;
public class MyClass {


    static boolean isSubSequence(String str1, String str2,
                                 int m, int n)
    {
      int j = 0; 
      for(int i = 0; i < m && i < n; i++)
          if(str1.charAt(i) == str2.charAt(j))
          j++;
        return (j==m);  
      
    }
 
    // Driver program to test methods of
    // graph class
    public static void main(String[] args)
    {
        String str1 = "gee";
        String str2 = "geeksforgeeks";
        int m = str1.length();
        int n = str2.length();
        boolean res = isSubSequence(str1, str2, m, n);
 
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


