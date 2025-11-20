class Solution {
    public List<List<Integer>> permute(int[] arr) {
        int n  = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        permu(0,n-1,arr,ans);
        return ans;
        
    }
    public static void permu(int l,int r,int arr[],List<List<Integer>> ans){
        if (l == r) {
            List<Integer> list = new ArrayList<>();
            for (int x : arr) list.add(x);
            ans.add(list);
            return;
        }

        for(int i = l;i<=r;i++){
            int temp = arr[l];
            arr[l] = arr[i];
            arr[i] = temp;permu(l+1,r,arr,ans);
            int t = arr[l];
            arr[l] = arr[i];
            arr[i] = t;

        }

    }
}