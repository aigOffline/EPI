public class MyClass {
      // Function to find the maximum sum of a contiguous subarray
  
 
    static int maxSubArraySum(int a[])
    {
        int max_so_far = a[0], max_ending_here = 0;
 
    for (int i = 0; i < a.length; i++)
    {
        max_ending_here = max_ending_here + a[i];
        if (max_ending_here < 0)
            max_ending_here = 0;
         
        /* Do not compare for all
           elements. Compare only
           when max_ending_here > 0 */
        else if (max_so_far < max_ending_here)
            max_so_far = max_ending_here;
         
    }
    return max_so_far;
    }
      // in a given integer array (handles negative numbers as well)
     public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
}


