class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1);
            } else {
                mp.put(num, mp.get(num) + 1);
            }
        }
        int index = 0;
        int res[] = new int[mp.size()];
        for (int a : mp.keySet()) {
            res[index++] = mp.get(a);
        }
        Arrays.sort(res);
        boolean found = true;
        for (int i = 0; i < res.length - 1; i++) {
            if (res[i] == res[i + 1]) {
                found = false;
                break;
            }
        }
        return found;
    }
}