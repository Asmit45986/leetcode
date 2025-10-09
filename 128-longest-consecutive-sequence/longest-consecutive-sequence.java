class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : arr) {
            st.add(num);
        }
        int max = 0;
        for (int x : st) {
            if (!st.contains(x - 1)) {
                int currlen = x;
                int maxstreak = 1;
                while (st.contains(currlen + 1)) {
                    currlen++;
                    maxstreak++;

                }
                max = Math.max(maxstreak, max);
            }
        }
        return max;
    }
}