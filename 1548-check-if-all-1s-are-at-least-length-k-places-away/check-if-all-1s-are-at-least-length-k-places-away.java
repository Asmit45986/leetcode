class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        boolean found = true;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                index = i;
                break;
            }
        }
        index1 = index;
        System.out.println(index);
        System.out.println(count);
        for(int i = index+1 ;i<nums.length;i++){
            if(nums[i]==1) {
                index2 = i;
                System.out.println(index2 +" "+index1);
                int res = index2 - index1-1;
                System.out.println(res);
                if (res >= k) {
                    index1 = index2;
                } else {
                    found = false;
                    break;
                }
            }
        }
        return found;
    }
}