import java.util.*;
public class MyClass {
      public static void print2SingleNumbers(int[] nums){
       
          /*We use a TreeMap to store the elements
          in the sorted order*/
         TreeMap<Integer, Integer> map = new TreeMap<>();
       
          int n = nums.length;
       
          /*Iterate through the array and check if each
          element is present or not in the map. If the
        element is present, remove it from the array
        otherwise add it to the map*/
       
          for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i]))
                  map.remove(nums[i]);
            else
                map.put(nums[i],1);
        }
       
          System.out.println("The non-repeating integers are " + map.firstKey() + " " + map.lastKey());
    }
      //Driver code
    public static void main (String[] args) {
        int[] nums = new int[]{2,11,3,11,7,3,9,2};
          print2SingleNumbers(nums);
    }
 
}

