class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>>res = new HashSet<>();
        solve(0,nums,new ArrayList(),res);
        return new ArrayList(res);
    }
    void solve(int idx,int nums[],List<Integer>curr,Set<List<Integer>>res){
        if(curr.size()>1){
            res.add(new ArrayList(curr));
        }
        for(int i = idx;i<nums.length;i++){
            if(curr.isEmpty() || curr.get(curr.size()-1)<=nums[i]){
                curr.add(nums[i]);
                solve(i+1,nums,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}