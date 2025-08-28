class Solution {
    public int maximumProduct(int[] nums) {
        
         Arrays.sort(nums);
        int n = nums.length;
        int result = Integer.MIN_VALUE;
        if (nums[0] < 0 && nums[1] < 0) {
            result = nums[0] * nums[1];
        }
        int x = nums[n - 3];
        int y = nums[n - 2];
        int sol = x * y;
        if (result < sol || nums[n - 1] < 0) {
            return sol * nums[n - 1];
        } else {
            return result * nums[n - 1];
        }
    }
}      