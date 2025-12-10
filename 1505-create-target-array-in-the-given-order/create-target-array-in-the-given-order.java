class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int res[] = new int[n];
        List<Integer> ll = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            ll.add(index[i],nums[i]);
        }
        for(int i = 0 ; i<n;i++){
            res[i] = ll.get(i);
        }
        return res;
        
    }
    
}