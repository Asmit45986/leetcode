class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int res = help(0,nums,target,0);
        return res;
    }
    public static int help(int i , int nums[],int target,int ans){
        if(i==nums.length){
            if(ans==target) return 1;
            else return 0;
        }
        int plus = help(i+1,nums,target,ans+nums[i]);
        int minus = help(i+1,nums,target,ans-nums[i]);
        return plus+minus;
    }
}