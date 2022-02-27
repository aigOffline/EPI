import java.util.*;
import java.util.Arrays;
public class MyClass 
{
static int findMissingUtil(int arr[], int low, int high, int diff)
{   
      // Find index of middle element
    int mid;
    while (low <= high)
    {   
          // find index of middle element
        mid = (low + high) / 2;
          // if mid == (nth position of element in AP)-1
          // the missing element will exist in right half
        if ((arr[mid] - arr[0]) / diff == mid)
            low = mid + 1;
        else
        // the missing element will exist in left half
            high = mid - 1;
    }
      // after breaking out of binary search loop
      // our missing element will exist between high and low
      // our missing element will be a[high] + common difference
      // or a[low] - common difference
    return arr[high] + diff;
}
 
// The function uses findMissingUtil()
// to find the missing element in AP.
// It assumes that there is exactly
// one missing element and may give
// incorrect result when there is no
// missing element or more than one
// missing elements. This function also
// assumes that the difference in AP is
// an integer.
static int findMissing(int arr[], int n)
{
    // If exactly one element is missing,
    // then we can find difference of
    // arithmetic progression using
    // following formula. Example, 2, 4,
    // 6, 10, diff = (10-2)/4 = 2.
    // The assumption in formula is that
    // the difference is an integer.
    int diff = (arr[n - 1] - arr[0]) / n;
 
    // Binary search for the missing
    // number using above calculated diff
    return findMissingUtil(arr, 0, n - 1, diff);
}
 
// Driver Code
public static void main (String[] args)
{
    int arr[] = {2, 4, 8, 10, 12, 14};
    int n = arr.length;
    System.out.println("The missing element is "+  
                            findMissing(arr, n));
}
}

