import java.util.*;
public class MyClass {
  public static int lengthOfLongestSubstring(String s) {
      int start = 0;
        int end = 0;
        int max = 0;
        HashSet set = new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                if(set.add(s.charAt(end)))
                    end++;
                max = Math.max(set.size(), max);
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
// Driver code
public static void main(String[] args)
    {
    String s = "bbbbb";

 
    // Function call
 
    System.out.print("The two strings are " +
                         lengthOfLongestSubstring(s));
  
    }
}

