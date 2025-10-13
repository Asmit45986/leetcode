class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] arr1, int[][] arr2) {
        Map<Integer, Integer> mp = new TreeMap<>();
        int max = Math.max(arr1.length, arr2.length);
        int res[][] = new int[max][2];
        for (int i = 0; i < arr1.length; i++) {
            mp.put(arr1[i][0], arr1[i][1]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!mp.containsKey(arr2[i][0])) {
                mp.put(arr2[i][0], arr2[i][1]);

            } else {
                mp.put(arr2[i][0], mp.get(arr2[i][0]) + arr2[i][1]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int key : mp.keySet()) {
            result.add(Arrays.asList(key, mp.get(key)));
        }
        return result;
    }
}