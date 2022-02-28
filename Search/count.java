public class MyClass {
    // A recursive binary search
    // function. It returns location
    // of x in given array arr[l..r]
    // is present, otherwise -1
   public static int binarySearch(int nums[], int l,
                            int r, int x)
    {
         while(l <= r){
            //[1,2,3,4,5,6,7] mid = 4
            int mid = l + (r - l)/2;
            if(nums[mid] == x)
                return mid;
           // [1,2,3,4,5,6,7] mid = 4 target = 6
            if(nums[mid] < x)
                l = mid + 1;
            else
                r = mid -1;
        }
  
    return -1;
    }
    // Returns number of times x
    // occurs in arr[0..n-1]
    public static int count(int arr[],
                                int n, int x)
    {
        int ind = binarySearch(arr, 0,
                               n - 1, x);
 
        // If element is not present
        if (ind == -1)
            return 0;
 
        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 &&
               arr[left] == x)
        {
            count++;
            left--;
        }
 
        // Count elements
        // on right side.
        int right = ind + 1;
        while (right < n &&
               arr[right] == x)
        {
            count++;
            right++;
        }
 
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 2, 2, 2,2,
                     3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        System.out.print(count(arr, n, x));
    }

 
}

