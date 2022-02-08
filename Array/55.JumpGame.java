class Solution {
    public boolean canJump(int[] nums) {
        
       int n = nums.length;
       int i = n-1;
        for(int j = n-1; j >= 0; j--){
            if(j+nums[j] >= i){
                i = j;
            }
        }
        return i == 0;
    }
}
