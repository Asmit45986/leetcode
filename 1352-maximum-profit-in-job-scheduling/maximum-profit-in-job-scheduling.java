class Solution {
    int n;
    public int jobScheduling(int[] st, int[] et, int[] pf) {
        n = st.length;
        int arr[][] = new int[n][3];
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        for(int i = 0 ; i<n;i++){
            arr[i][0] = st[i];
            arr[i][1] = et[i];
            arr[i][2] = pf[i];
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
        return solve(0,arr,dp);
    }
    int next(int l , int end, int arr[][]){
        int r = n-1;
        int res = n;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid][0]>=end){
                res = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;
    }
    int solve(int i , int arr[][],int dp[]){
        if(dp[i]!=-1) return dp[i];
        if(i>=n){
            return 0;
        }
        int step = next(i+1,arr[i][1],arr);
        int take = arr[i][2] + solve(step,arr,dp);
        int nottake = solve(i+1,arr,dp);
        return dp[i] = Math.max(take,nottake);
    }
}