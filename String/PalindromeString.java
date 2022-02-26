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




public class MyClass {
   public static boolean isPalindrome(String str){
       int i = 0, j = str.length()-1;
       while(i < j){
           if(str.charAt(i) != str.charAt(j))
           return false;
           i++;
           j--;
       }
       return true;
   }
   public static void main(String[]args){
       String check = "aBa";
       String check1 = "rabar";
       String check2 = "race";
       String str = check.toLowerCase();
       if(isPalindrome(str))
            System.out.println("Palindrome");
       else
            System.out.println("Not Palindrome");
       if(isPalindrome(check1))
            System.out.println("Palindrome");
       else
            System.out.println("Not Palindrome");
        if(isPalindrome(check2))
            System.out.println("Palindrome");
       else
            System.out.println("Not Palindrome");
   }
}
