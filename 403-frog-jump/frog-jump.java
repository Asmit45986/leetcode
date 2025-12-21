class Solution {
    public boolean canCross(int[] stones) {
        if(stones[1]!= 1) return false;
        
        Map<Integer,Integer>mp = new HashMap<>();
        int n = stones.length;
        int dp[][] = new int[n+1][n+1];
        for(int row[] : dp) Arrays.fill(row,-1);
        for(int i = 0 ; i< n;i++){
            mp.put(stones[i],i);
        }
        return solve(0,0,stones,mp,dp);
    }
    boolean solve(int curridx,int prevjump,int stones[],Map<Integer,Integer>mp,int dp[][]){
        if(dp[curridx][prevjump]!= -1) return dp[curridx][prevjump]==1;
        if(curridx == stones.length-1) return true;
        boolean found = false;
        for(int nextjump = prevjump-1 ; nextjump<=prevjump+1 ; nextjump++){
            if(nextjump>0){
                int nextidx = stones[curridx] + nextjump;
                if(mp.containsKey(nextidx)){
                    found = found || solve(mp.get(nextidx),nextjump,stones,mp,dp);
                }
            }
        }
        dp[curridx][prevjump] = found?1:0;
        return found;
    }
}