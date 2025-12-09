class Solution {
    public int minDifficulty(int[] arr, int d) {
        int dp[][] = new int[301][11];
        for(int row[]:dp) Arrays.fill(row,-1);
        int n = arr.length;
        if(n<d){
            return -1;
        }
        return solve(0,arr,d,n,dp);
    }
    public static int solve(int i,int arr[],int d, int n,int dp[][]){
        if(dp[i][d] != -1) return dp[i][d];
        if(d==1){
            int max = arr[i];
            for(int j = i;j<n;j++){
                max = Math.max(max,arr[j]);
            }
            return max;
        }
        int maxd = arr[i];
        int finres = Integer.MAX_VALUE;

        for(int j = i ; j <= n-d;j++){
            maxd = Math.max(maxd,arr[j]);
            int result = maxd+solve(j+1,arr,d-1,n,dp);
            finres = Math.min(finres,result);
        }
        return dp[i][d]=finres;
    }
}