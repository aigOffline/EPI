public class MyClass {
 
   
    // This function prints the
    // longest palindrome substring
    // (LPS) of str[]. It also
    // returns the length of the
    // longest palindrome
    public static int longestPalSubstr(String str){
    int low, high;
    int MaxLen = 1, start = 0;
    int n = str.length();
    if(n < 2)
        return n;
    for(int i = 0; i < n; i++){
        high = i + 1;
        low = i - 0;
        while(high < n && str.charAt(high) == str.charAt(i))
            high++;
        while(low >= 0 && str.charAt(low) == str.charAt(i))
            low--;
        while(low >= 0 && high < n && str.charAt(high) == str.charAt(low)){
            low--;
            high++;
        }
        int length = high - low - 1;
        if(MaxLen < length){
            MaxLen = length;
            start = low + 1;
        }
    }
    System.out.println("Substring: ");
    System.out.println(str.substring(start, start+MaxLen));
        return MaxLen;
    }
    
    // Driver program to test above function
    public static void main(String[] args)
    {
 
        String str = "babad";
        String str1 = "cbbd";
        System.out.println("Length is: "
                           + longestPalSubstr(str1));
    }
}
