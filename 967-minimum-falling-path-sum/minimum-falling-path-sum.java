class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n  = arr.length;
        int result = Integer.MAX_VALUE;
        int dp[][] = new int[n][n];
        for(int row[] :dp) Arrays.fill(row,Integer.MIN_VALUE);
        for(int j=0;j<arr.length;j++){
            result = Math.min(result,solve(0,j,arr,dp));
        }
        return result;
    }
    public static int solve(int i, int j , int arr[][],int dp[][]){
        if(j<0 || j>=arr.length) return Integer.MAX_VALUE;
        if(i==arr.length-1) return arr[i][j];
        if(dp[i][j]!=Integer.MIN_VALUE) return dp[i][j];
        int a = solve(i+1,j-1,arr,dp);
        int b = solve(i+1,j,arr,dp);
        int c = solve(i+1,j+1,arr,dp);
        return dp[i][j] = arr[i][j]+Math.min(a,Math.min(b,c));
    }
}
