class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>allboard = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allboard,0);
        return allboard;
    }
    public static void helper(char[][] board,List<List<String>>allboard,int col){
        if(col==board.length){
            saveboard(board,allboard);
            return;
        }
        for(int row = 0 ; row<board.length ; row++){
            if(issafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board,allboard,col+1);
                board[row][col]= '.';
            }
            
        }

    }
    public static boolean issafe(int row,int col,char board[][]){
        //row
        for(int i = 0;i<board.length;i++){
            if(board[row][i]=='Q')
            return false;
        }
        //uuperleft
        for(int r = row, c = col ; c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(int r = row,c = col ; r<board.length && c>=0;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveboard(char[][] board, List<List<String>>allboard){
        String row = "";
        List<String>newboard= new ArrayList<>();
        for(int i = 0 ; i<board.length;i++){
            row = "";
            for(int j = 0 ; j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allboard.add(newboard);
        return; 
    }
}