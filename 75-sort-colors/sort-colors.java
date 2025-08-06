
class Solution {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int a = count0 + count1;
        int b = count0 + count1 + count2;
        for (int i = 0; i < n; i++) {
            if (i < count0) {
                nums[i] = 0;
            } else if (i < a) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }

        }
        return;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        obj.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
