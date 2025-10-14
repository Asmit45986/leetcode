class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char ch[] = s.toCharArray();
        int max = -1;
        for (int i = 0; i < s.length() - 1; i++) {
            int res = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (ch[i] == ch[j]) {
                    res = j - i - 1;
                    max = Math.max(max, res);
                }

            }
        }
        return max;
    }
}