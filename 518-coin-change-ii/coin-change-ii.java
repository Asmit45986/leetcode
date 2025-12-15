class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int row[] : dp) Arrays.fill(row,-1);
        int ans = solve(0,amount,coins,dp);
        return ans;

    }
    public static int solve(int i , int amount, int coins[] , int dp[][]){
        
        if(amount==0) return dp[i][amount] = 1;
        if(i==coins.length) return 0;
        if(dp[i][amount]!= -1) return dp[i][amount];
        dp[i][amount] = solve(i+1,amount,coins,dp);
        if(amount>=coins[i]){
            dp[i][amount] += solve(i,amount-coins[i],coins,dp);
        } 
        return dp[i][amount];
    }
}