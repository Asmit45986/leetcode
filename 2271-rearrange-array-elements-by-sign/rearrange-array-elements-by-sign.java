
class Solution{
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = {3, 1, -2, -5, 2, -4};
        int result[] = obj.rearrangeArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
