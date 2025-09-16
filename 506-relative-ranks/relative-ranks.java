class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = score[i];
        }
        Arrays.sort(score);
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = score[start];
            score[start] = score[end];
            score[end] = temp;
            start++;
            end--;
        }
        int rank[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == score[i]) {
                    rank[j] = i + 1;
                    break;
                }
            }
        }
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            if (rank[i] == 1) {
                str[i] = "Gold Medal";

            } else if (rank[i] == 2) {
                str[i] = "Silver Medal";
            } else if (rank[i] == 3) {
                str[i] = "Bronze Medal";

            } else {
                str[i] = String.valueOf(rank[i]);
            }

        }
        return str;
        
    }
}