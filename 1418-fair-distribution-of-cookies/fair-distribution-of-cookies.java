class Solution {
    int ans = Integer.MAX_VALUE;
    int n;
    public int distributeCookies(int[] cook, int k) {
        int arr[] = new int[k];
        Arrays.fill(arr,0);
        n = cook.length;
        solve(0,cook,k,arr);
        return ans;
    }
    void solve(int idx, int cook[], int k , int arr[]){
        if(idx>=n){
            int maxcurr = 0;
            for(int i = 0 ; i<k;i++){
                maxcurr = Math.max(maxcurr,arr[i]);
            }
            ans  = Math.min(maxcurr,ans);
            return;
        
            
        }
        int cookie = cook[idx];
        for(int i = 0 ; i<k;i++){
            arr[i] += cookie;
            solve(idx+1,cook,k,arr);
            arr[i] -= cookie;
        }
    }
}