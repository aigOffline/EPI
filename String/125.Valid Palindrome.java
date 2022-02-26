public class MyClass {
   public static boolean isPalindrome(String str){
       int i = 0, j = str.length()-1;
       char charI, charJ;
       while(i <= j){
           //I need to conver my string to char
           charI = str.charAt(i);
           charJ = str.charAt(j);
           //I have to check for space and digits and upperCase in Character
           if(!Character.isLetterOrDigit(charI)){
               i++;
           }
           else if(!Character.isLetterOrDigit(charJ)){
               j--;
           }
           else{
               if(Character.toLowerCase(charI) != Character.toLowerCase(charJ))
                    return false;
               
              i++;
              j--;
           }
           
       }
       return true;
   }
   public static void main(String[]args){
       String check = "A man, a plan, a canal: Panama";
       String check1 = "race a car";
       String check2 = " ";
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
