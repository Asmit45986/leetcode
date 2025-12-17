class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int row[]: dp) Arrays.fill(row,-1);
        int ans = solve(0,coins,amount,dp);
        if(ans==1000000000){
            return -1;
        }
        return ans;

    }
    int solve(int i,int coins[],int amount,int dp[][]){
        if(dp[i][amount]!=-1)return dp[i][amount];
        if(amount==0) return 0;
        if(i==coins.length)return (int)1e9;
        int pick = (int)1e9;
        if(amount>=coins[i]){
            pick = 1+solve(i,coins,amount-coins[i],dp);
        }
        int notpick = solve(i+1,coins,amount,dp);
        return dp[i][amount] = Math.min(pick,notpick);

    }    
}