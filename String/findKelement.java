public class MyClass {
    public static void main(String args[]) {
        String str
            = "GeeksforGeeks is a computer science portal";
  
   int first_in = str.indexOf("Geeks", 10);
        System.out.println("First occurrence of char Geeks"
                           + " after index 10 : "
                           + first_in);
  
        int last_in = str.lastIndexOf("Geeks", 20);
        System.out.println("Last occurrence of char Geeks "
                           + "after index 20 is : "
                           + last_in);
    }
}


