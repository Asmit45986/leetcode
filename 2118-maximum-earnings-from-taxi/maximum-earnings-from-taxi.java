class Solution {
    int r;
    public long maxTaxiEarnings(int n, int[][] arr) {
        Arrays.sort(arr,Comparator.comparing(a->a[0]));
        r = arr.length;
        long dp[] = new long[r+1];
        Arrays.fill(dp,-1);
        return solve(0,n,arr,dp);
        
    }
    long solve(int i,int n , int arr[][],long dp[]){
        
        if(i>=arr.length) return 0;
        if(dp[i] !=-1) return dp[i];
        if(arr[i][1] > n) return 0;
        int next = step(i+1,arr[i][1],arr);
        long pick = 0;
        if(arr[i][1]<=n){
            pick = (arr[i][1]-arr[i][0])+arr[i][2] + solve(next,n,arr,dp);
        }
        
        long notpick = solve(i+1,n,arr,dp);
        return dp[i] = Math.max(pick,notpick); 
    }
    int step(int l , int end,int arr[][]){
        int r = arr.length-1;
        int res = arr.length+1;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(arr[mid][0]>=end){
                res = mid;
                r = mid-1;

            }else{
                l = mid+1;
            }
        }
        return res;
    }
}