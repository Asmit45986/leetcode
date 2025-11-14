class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            d = nums[i][i];
            System.out.println(d);
            boolean found = true;
            if (d <= 1) found = false; 
            for (int j = 2; j <= Math.sqrt(d); j++) {
                if (d % j == 0) {
                    found = false;
                    break;
                }

            }
            if (found == true) {
                max = Math.max(d, max);
            }
        }
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = nums[i][nums.length - i - 1];
            boolean found1 = true;
            if (a <= 1) found1 = false; 
            for (int j = 2; j <= Math.sqrt(a); j++) {
                if (a % j == 0) {
                    found1 = false;
                    break;
                }

            }
            if (found1 == true) {
                max = Math.max(a, max);
            }
        }

        return max;
    }
}
