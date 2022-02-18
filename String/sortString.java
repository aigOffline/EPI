import java.util.*;
public class MyClass {
       // Method 1
    // To sort a string alphabetically
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char[] temp = inputString.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);
        // Print and display commands
        // Input string
        System.out.println("Input String : " + inputString);
        // Output string
        System.out.println("Output String : "
                           + outputString);
    }
}


