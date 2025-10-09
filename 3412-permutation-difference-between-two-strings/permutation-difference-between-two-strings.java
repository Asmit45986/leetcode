class Solution {
    public int findPermutationDifference(String s, String t) {
        char ch[] = s.toCharArray();
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = ch[i];
            d += Math.abs(i - t.indexOf(a));
        }
        return d;
    }
}