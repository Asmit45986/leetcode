class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] == -1) {
                    int c = k;
                    int max = matrix[0][c];
                    for (int l = 0; l < matrix.length; l++) {
                        if (max < matrix[l][c]) {
                            max = matrix[l][c];
                        }
                    }
                    matrix[i][k] = max;
                }
            }
        }
        return matrix;
    }
}