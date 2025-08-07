
class Solution {

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            } else {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = {3, 1, 2, 4};
        int result[] = obj.sortArrayByParity(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
