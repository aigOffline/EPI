public class MyClass {
  public static int characterReplacement(String s, int k) {
        int len = s.length();
        int[] count = new int[26];
        int start = 0, maxCount = 0, maxLen = 0;
        for(int end=0; end<len; end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
            while(end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A'] --;
                start ++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
// Driver code
public static void main(String[] args)
    {
    String s = "AABABBA";
    int k = 1;
 
    // Function call
 
    System.out.print("The two strings are " +
                         characterReplacement(s, k));
  
    }
}


