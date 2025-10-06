class Solution {
    public int sumOfUnique(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        int max = 0;
        for (int res : freq.keySet()) {
            if (freq.get(res) == 1) {
                max += res;
            }
        }
        return max;
    }
}