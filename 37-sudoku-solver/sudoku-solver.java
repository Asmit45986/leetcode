class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
        return;
    }
    public boolean helper(char board[][],int row,int col){
        if(row==board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol = 0;
        }
        if(board[row][col]!='.'){
            return helper(board,nrow,ncol);
        }else{
            for(int i = 1; i<=9;i++){
                if(issafe(board,row,col,i)){
                    board[row][col] = (char)(i + '0');
                
                    if(helper(board,nrow,ncol)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }    
                }
            }
        }
        return false;   
    }
    public boolean issafe(char board[][],int row,int col,int number){
        for(int i = 0 ; i<board.length;i++){
            if(board[row][i] ==(char)number+'0'){
                return false;
            }
            if(board[i][col]==(char)number+'0'){
                return false;
            }
        }
        //grid
        int nr = (row/3)*3;
        int nc = (col/3)*3;
        for(int i = nr;i<nr+3;i++){
            for(int j = nc; j<nc+3;j++){
                if(board[i][j]==(char)number +'0'){
                    return false;
                }
            }
        }
        return true;
    }
}