class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // int max = nums[0];
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > max) {
        //         max = nums[i];
        //         index = i;
        //     }

        // }
        // int k = 0;
        // while (k < index) {
        //     int temp = nums[k];
        //     nums[k] = nums[index];
        //     nums[index] = temp;
        //     k++;
        //     index--;
        // }
        // int start = 0;
        // int end = nums.length - 1;
        // while (start < end) {
        //     int temp = nums[start];
        //     nums[start] = nums[end];
        //     nums[end] = temp;
        //     start++;
        //     end--;

        // }
        int small = 1;
        int i = 0;
        while (i < n){
            if (i < n-1 && (nums[i] <= 0 || nums[i]==nums[i+1])) {
                i++;
            } else if (nums[i] > 0 && nums[i] == small) {
                small++;
                i++;
            } else if (nums[i] != small) {
                break;
            }
        }
        return small;
        
    }
}