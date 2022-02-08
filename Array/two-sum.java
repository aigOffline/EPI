class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[] {1,1};
        int n = nums.length;
        for(int i= 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
