class Solution {
    public int smallestNumber(int n) {
        String binary = Integer.toBinaryString(n);
        int count = binary.length();
        int res = (int) Math.pow(2, count) - 1;
        return res;
    }
}