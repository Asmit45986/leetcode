class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] ch = s.toCharArray();
        int n = s.length();
        int[] result = new int[n];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (ch[i] == c) {
                prev = i;
            }
            result[i] = i - prev;
        }
        prev = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (ch[i] == c) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }
        return result;
         
    }
}