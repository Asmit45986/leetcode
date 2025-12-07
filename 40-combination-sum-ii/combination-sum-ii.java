class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,arr,target,new ArrayList<>(),ans);
        return ans;

    }
    public static void helper(int i,int arr[],int target,List<Integer>ll, List<List<Integer>> ans){
        if(target ==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(i==arr.length || arr[i]>target){
            return;
        }
        ll.add(arr[i]);
        helper(i+1,arr,target-arr[i],ll,ans);
        while(i+1<arr.length && arr[i]==arr[i+1]){
            i++;
        }
        ll.remove(ll.size()-1);
        helper(i+1,arr,target,ll,ans);
        
    }
}