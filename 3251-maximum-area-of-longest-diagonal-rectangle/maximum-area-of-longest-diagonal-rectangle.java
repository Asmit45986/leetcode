class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        double[] sol = new double[n];
        for (int i = 0; i < n; i++) {
            double a = dimensions[i][0];
            double b = dimensions[i][1];
            double c = a * a + b * b;
            sol[i] = c;
        }
        double max = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int area = dimensions[i][0] * dimensions[i][1];
            int bestArea = dimensions[x][0] * dimensions[x][1];

            if (sol[i] > max || (sol[i] == max && area > bestArea)) {
                max = sol[i];
                x = i;

            }
        }
        int result = dimensions[x][0] * dimensions[x][1];
        return result;    
    }
}