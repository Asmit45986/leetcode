class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int start = 0;
        int index = 0;
        int res = 0;
        int a = Integer.MIN_VALUE;
        while (start < n - 1) {
            if (a == nums[start]) {
                start++;
            } else if (nums[start] == nums[start + 1]) {

                nums[index++] = nums[start];
                nums[index++] = nums[start + 1];
                a = nums[start];
                start = start + 2;
                res += 2;
            } else if (nums[start] != nums[start + 1]) {
                nums[index++] = nums[start];
                start++;
                res++;
            }
        }
        if (start == n - 1 && nums[start] != a) {
            nums[index++] = nums[start];
            res++;
        }
        
        return res;
        
    }
}