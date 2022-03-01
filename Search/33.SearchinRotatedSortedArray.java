public class MyClass {
   public static int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
        return -1;
    }
    
    /*.*/
    int left = 0, right = nums.length - 1;
    //when we use the condition "left <= right", we do not need to determine if nums[left] == target
    //in outside of loop, because the jumping condition is left > right, we will have the determination
    //condition if(target == nums[mid]) inside of loop
    while (left <= right) {
        //left bias
        int mid = left + (right - left) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        //if left part is monotonically increasing, or the pivot point is on the right part
        if (nums[left] <= nums[mid]) {
            //must use "<=" at here since we need to make sure target is in the left part,
            //then safely drop the right part
            if (nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            }
            else {
                //right bias
                left = mid + 1;
            }
        }

        //if right part is monotonically increasing, or the pivot point is on the left part
        else {
            //must use "<=" at here since we need to make sure target is in the right part,
            //then safely drop the left part
            if (nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
    }
    return -1;
}
    // main function
    public static void main(String args[])
    {
        // Let us search 3 in below array
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        System.out.println("Index of the element is : "
                           + search(arr1, key));
    }
}


