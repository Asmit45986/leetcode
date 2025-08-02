
class Solution {

    public int majorityElement(int[] nums) {

        int n = nums.length;
        int[] sum = new int[n];
        int count;

        for (int i = 0; i < n; i++) {
            count = 0;
            
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            sum[i] = count;
            }
                int maxCount = 0;
        int majority = nums[0];

        for(int i = 0; i < n; i++) {
            if(sum[i] > maxCount) {
                maxCount = sum[i];
                majority = nums[i];
            }
        }

        System.out.println(majority);
        return majority;


    }

    public static void main(String[] args) {

        Solution obj = new Solution();
        int[] nums = {2,2,1,1,1,2,2};
        obj.majorityElement(nums);
    }
}
