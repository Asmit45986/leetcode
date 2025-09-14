class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] == nums[start + 1]) {
                return nums[start];
            }
            start++;
        }
        return -1;       
    }
}