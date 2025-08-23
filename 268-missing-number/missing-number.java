class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int b = nums[i];
            result[b] = 1;
        }
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                c = i;
            }
        }
        return c;
    }
}