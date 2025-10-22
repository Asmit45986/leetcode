class Solution {
    public int[] finalPrices(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] >= arr[j]) {
                    arr[i] = arr[i] - arr[j];
                    break;
                }

            }
            i++;
        }
        return arr;
    }
}