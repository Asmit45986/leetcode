class Solution {
    public int duplicateNumbersXOR(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1);
            } else {
                mp.put(num, mp.get(num) + 1);
            }
        }
        int x = 0;
        for (int num : mp.keySet()) {
            if (mp.get(num) == 2) {
                x ^= num;
            }
        }
        return x;
    }
}