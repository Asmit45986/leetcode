class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    
        int res[][] = new int[r][c];
        int index = 0;
        int m = mat.length;
        int n = mat[0].length;
        
        if(m*n != r*c){
            return mat;
        }
        int arr[] = new int[r*c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = mat[i][j];

            }
        }
        int x = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = arr[x++];
            }
        }
        return res;
    }
}