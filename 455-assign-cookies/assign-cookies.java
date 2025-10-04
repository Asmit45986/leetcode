class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int j = 0;
        while (start < g.length && j<s.length) {
            if (g[start] <= s[j]) {
                max++;
                start++;
                j++;
            } else {
                j++;
            }
        }
        return max;
    }
}