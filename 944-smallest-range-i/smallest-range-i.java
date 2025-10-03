class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[n-1];
        int min = Integer.MAX_VALUE;
            a = nums[0]+k;
            for(int i = 0; i<=k*2; i++){
                int x = b+(i-k);
                min = Math.min(min,x-a);
                if(min<0){
                    min = 0;
                }
            }
        
        return min;
    }
}