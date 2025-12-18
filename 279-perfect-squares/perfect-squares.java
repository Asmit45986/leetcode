class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    int solve(int n,int dp[]){
        if(dp[n]!=-1) return dp[n];
        if(n==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1;i*i<=n;i++){
            int result = 1+solve(n-i*i,dp);
            min = Math.min(min,result);
        }
        return dp[n] = min;
    }
}