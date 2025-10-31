class Solution {
    public int[] getSneakyNumbers(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res[] = new int[2];
        for (int num : arr) {
            if (!mp.containsKey(num)) {
                mp.put(num, 1);
            } else {
                mp.put(num, mp.get(num) + 1);
            }
        }
        int index = 0;
        for (int num : mp.keySet()) {
            if (mp.get(num) == 2 && index<2) {
                res[index++] = num;
            }
        }
        return res;
        
    }
}