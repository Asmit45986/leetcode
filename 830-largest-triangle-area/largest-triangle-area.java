class Solution {
    public double largestTriangleArea(int[][] arr) {
        double max = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            for (int j = i + 1; j < arr.length - 1; j++) {
                int x2 = arr[j][0];
                int y2 = arr[j][1];
                for (int k = j + 1; k < arr.length; k++) {
                    int x3 = arr[k][0];
                    int y3 = arr[k][1];
                    double sol = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
                    double res = Math.abs(sol) / 2;
                    max = Math.max(max, res);

                }
            }

        }
        return max;
        
    }
}