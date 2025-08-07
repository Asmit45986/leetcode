class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2; 
            } else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            } else {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = {4, 5, 7, 2}; 
        int result[] = obj.sortArrayByParityII(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
