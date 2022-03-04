import java.util.*;
public class MyClass {
 // function to find the first element
  // occurring k number of times
  static void findMissing(int a[], int b[],
                    int n, int m)
    {
        // Store all elements of
        // second array in a hash table
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < m; i++)
            s.add(b[i]);
         
        // Print all elements of first array
        // that are not present in hash table
        for (int i = 0; i < n; i++)
            if (!s.contains(a[i]))
                System.out.print(a[i] + " ");
    }
 
    public static void main(String []args){
         
        int a[] = { 1,2,3,4,5,6,7,8};
        int b[] = { 1,2,3,4,5};
        int n = a.length;
        int m = b.length;
 
        findMissing(a, b, n, m);
    }
}



