class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        
        int matrix[][] = new int[m][n];
        int index = 0;
        if(arr.length != m*n){
            return new int[0][];
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[index++];
            }
        }
        return matrix;
    }
}