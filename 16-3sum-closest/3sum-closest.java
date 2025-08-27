import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // sort the array
        int n = nums.length;
        int closeSum = nums[0] + nums[1] + nums[2]; // initialize with first 3 elements

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // update closest sum if needed
                if (Math.abs(target - sum) < Math.abs(target - closeSum)) {
                    closeSum = sum;
                }

                if (sum < target) {
                    left++;  // move left pointer to increase sum
                } else if (sum > target) {
                    right--; // move right pointer to decrease sum
                } else {
                    // exact match found
                    return sum;
                }
            }
        }
        return closeSum;
    }
}
