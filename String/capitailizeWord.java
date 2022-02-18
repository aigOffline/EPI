import java.util.*;
public class MyClass {
// Method to convert the string
    static String capitailizeWord(String str) {
    StringBuffer s = new StringBuffer();
    char ch = ' ';
    for(int i = 0; i < str.length(); i++){
       
        if (ch == ' ' && str.charAt(i) != ' ')
            s.append(Character.toUpperCase(str.charAt(i)));
        else
            s.append(str.charAt(i));
        ch = str.charAt(i);
        
    }
    return s.toString().trim();
    }
    // Driver Code
    public static void main(String args[]) {
        // Declare the string
        String s1 = "gEEks fOr GeeKs";
        // Convert that string into lowercase
        s1 = s1.toLowerCase();
        // Call the method to capitalize each word
        System.out.println(capitailizeWord(s1));
    }
}

