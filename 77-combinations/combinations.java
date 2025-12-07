class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans = new ArrayList<>();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = i+1;
        }
        helper(0,arr,new ArrayList<>(),ans,k);
        return ans;
    }
    public static void helper(int i,int arr[],List<Integer>ll, List<List<Integer>>ans,int k){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        if(i==arr.length){
            return;
        }
        ll.add(arr[i]);
        helper(i+1,arr,ll,ans,k);
        ll.remove(ll.size()-1);
        helper(i+1,arr,ll,ans,k);
    }
}