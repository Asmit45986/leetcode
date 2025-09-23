class Solution {
    public int longestConsecutive(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) set.add(num);

        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {  
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen;
    }
}