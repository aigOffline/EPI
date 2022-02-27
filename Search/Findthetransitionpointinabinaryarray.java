public class MyClass{
   static int findTransitionPoint(int arr[], int n)
    {
        // Initialise lower and upper bounnds
        int lb = 0, ub = n - 1;
 
        // Perform Binary search
        while (lb <= ub) {
            // Find mid
            int mid = (lb + ub) / 2;
 
            // update lower_bound if mid contains 0
            if (arr[mid] == 0)
                lb = mid + 1;
            // If mid contains 1
            else if (arr[mid] == 1) {
               
                if (mid == 0
                    || (mid > 0 &&
                       arr[mid - 1] == 0))
                    return mid;
                
                ub = mid - 1;
            }
        }
        return -1;
    }
  
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 0, 0, 0, 0,0, 1, 1 };
 
        int point = findTransitionPoint(arr, arr.length);
 
        System.out.println(
            point >= 0 ? "Transition point is " + point
                       : "There is no transition point");
    }
}
