class Solution {

    public int singleNumber(int[] nums) {
        int n = nums.length;
        int q = 0;
        for (int i = 0; i < n; i++) {
            q = nums[i] ^ q;

        }
        return q;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {4, 2, 1, 2, 1};
        int result = obj.singleNumber(nums);
        System.err.println(result);

    }
}
