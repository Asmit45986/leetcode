class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,arr,target,new ArrayList<>(),ans);
        return ans;
    }
    public static void helper(int i,int[] arr,int target,List<Integer>ll,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(target<0 || i==arr.length){
            return;
        }
        ll.add(arr[i]);
        helper(i,arr,target-arr[i],ll,ans);
        ll.remove(ll.size()-1);
        helper(i+1,arr,target,ll,ans);

    }
}