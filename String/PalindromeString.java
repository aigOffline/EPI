import java.util.*;

public class MyClass {
     static boolean isPalindrome(String str) {
         // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
        // While there are characters to compare
        while (i < j) {
            // If there is a mismatch
                if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }
  // Driver Code
  public static void main (String[] args)
  {
    // Given array arr[]
    String str2 = "racecar";
    // Function Call
   System.out.print("String 1 :");
        if (isPalindrome(str2))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");

  }
 
}
