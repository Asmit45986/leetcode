class Solution {
    public boolean areOccurrencesEqual(String s) {
        char ch[] = s.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        for (var c : ch) {
            if (!freq.containsKey(c)) {
                freq.put(c, 1);
            } else {
                freq.put(c, freq.get(c) + 1);
            }
        }
        int x = freq.get(ch[0]);
        for (var a : freq.keySet()) {
            if (freq.get(a) != x) {
                return false;
            }
        }
        return true;
    }
}