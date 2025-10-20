class Solution {
    public int finalValueAfterOperations(String[] s) {
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("X++") || s[i].equals("++X")) {
                res++;
            } else {
                res--;
            }
        }
        return res;
    }
}