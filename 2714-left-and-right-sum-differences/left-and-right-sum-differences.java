class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int left = 0;
            int sum1 = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (j == -1) {
                    sum1 = 0;
                    break;
                } else {
                    sum1 += arr[j];
                }
            }
            int sum2 = 0;
            for (int k = i + 1; k < arr.length; k++) {
                if (k == n) {
                    sum2 = 0;
                    break;
                } else {
                    sum2 += arr[k];
                }

            }
            for (int j = 0; j < res.length; j++) {
                res[i] = Math.abs(sum1 - sum2);

            }

        }
        return res;
        
    }
}