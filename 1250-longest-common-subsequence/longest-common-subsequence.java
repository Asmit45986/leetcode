class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int row[] :dp) Arrays.fill(row,-1);
        return solve(0,0,s1,s2,dp);
        
    }
    int solve(int i ,int j, String s1,String s2,int dp[][]){
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==s1.length() || j == s2.length()) return 0;
        
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1 + solve(i+1,j+1,s1,s2,dp);
        }else{
            int pick =   solve(i+1,j,s1,s2,dp);
            int notpick = solve(i,j+1,s1,s2,dp);
            return dp[i][j] = Math.max(pick,notpick);

        }
        
    }
}