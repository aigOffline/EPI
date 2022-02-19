import java.util.*;
import java.util.Arrays;
public class MyClass {
 public static String merge(String s1, String s2)
    {
        //here I am trying to merge two string 
        //I will run for loop in s1 and s2
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < s1.length() || i < s2.length(); i++){
             // First choose the ith character of the
            // first string if it exists
            if(i < s1.length())
                s.append(s1.charAt(i));
            // Then choose the ith character of the
            // second string if it exists
            if(i < s2.length())
                s.append(s2.charAt(i));
        }
        return s.toString();
    }
    public static void main(String args[]){
        String str1 = "ace";
        String str2 = "bd";
        System.out.print(merge(str1, str2));
    }
}
//abcde

