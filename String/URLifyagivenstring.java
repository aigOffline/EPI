import java.util.*;
import java.util.Arrays;
public class MyClass {
public static void main(String[] args)
    {
        // Instantiate the string
        String str = "Mr John Smith   ";
         
        // Trim the given string
        str = str.trim();
         
        // Replace All space (unicode is \\s) to %20
       // str = str.replaceAll("\\s", "%20");
         str = str.replaceAll(" ", "%20");
        // Display the result
        System.out.println(str);
    }

}
//Mr%20John%20Smith
//Mr%20John%20Smith

