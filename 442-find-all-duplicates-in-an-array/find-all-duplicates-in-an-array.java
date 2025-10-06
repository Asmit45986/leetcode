class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int el : nums) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println(freq.entrySet());
        for (int res : freq.keySet()) {
            if (freq.get(res) != 1) {
                al.add(res);
            }
        }
        return al;  
    }
}