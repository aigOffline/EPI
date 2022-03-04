import java.util.*;
public class MyClass {
 // function to find the first element
  // occurring k number of times
  static int firstElement(int []arr, int n, int k)
  {
 
    // unordered_map to count
    // occurrences of each element
    HashMap<Integer,Integer> count_map = new HashMap<>();
    for (int i = 0; i < n; i++)
    {
      if(count_map.containsKey(arr[i]))
      {
 
        count_map.put(arr[i], count_map.get(arr[i])+1);
      }
      else
        count_map.put(arr[i], 1);
    }
    //count_map[arr[i]]++;
 
    for (int i = 0; i < n; i++) // if count of element == k ,then
      // it is the required first element
    {
      if (count_map.containsKey(arr[i]) )
      {
        if(count_map.get(arr[i]) == k)
          return arr[i];
      }
    }
 
    // no element occurs k times
    return -1;
  }
 
  // Driver code
  public static void main(String[] args)
  {
    int []arr = {1, 7, 4, 3, 4, 8, 7,8,8};
    int n = arr.length;
    int k = 3;
    System.out.print(firstElement(arr, n, k));
  }
}




