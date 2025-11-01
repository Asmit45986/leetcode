class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> hp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (int j = Math.max(0, i - k); j <= Math.min(nums.length - 1, i + k); j++) {
                    hp.add(j);
                }

            }

        }

        List<Integer> ll = new ArrayList<>(hp);
        Collections.sort(ll);
        return ll;
    }
}