class Solution {
    int res = 0;
    int m,n;

    public int uniquePathsIII(int[][] grid) {
        int a = 0;
        int b = 0;
        int count = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j = 0; j <n;j++){
                if(grid[i][j]==0){
                    count++;
                }
                if(grid[i][j]==1){
                    a = i;
                    b = j;
                }
            }
        }
        solve(grid,count+1,a,b,0);
        return res;
    
    }
    int arr[][] = {{1,0},{-1,0},{0,1},{0,-1}};
    void solve(int grid[][],int count,int i,int j,int idx){
        
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==-1){
            return;
        }
        if(grid[i][j]==2){
            if(idx==count) res++;
            return;
            
        }
        int temp = grid[i][j];
        grid[i][j] = -1;
        for(int k = 0 ; k<4;k++){
            int in = i + arr[k][0];
            int jn = j + arr[k][1];
            solve(grid,count,in,jn,idx+1);
            
        }
        grid[i][j] = temp;
    }
}