class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0; j<n;j++){
                if(find(board,i,j,0,word,m,n)){
                    return true;
                }
            }
        }
        return false;
    }
    int arr[][] = {{1,0},{-1,0},{0,1},{0,-1}};
    boolean find(char[][] board,int i,int j,int idx,String word,int m , int n){
        if(idx==word.length()) return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j] != word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '@';
        for(int k=0;k<arr.length;k++){
            int in = i+arr[k][0];
            int jn = j+arr[k][1];
            if(find(board,in,jn,idx+1,word,m,n)) return true;
        }
        board[i][j] = temp;;
        return false;

    }
}