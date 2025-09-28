class Solution {
    public boolean isPerfectSquare(int num){
        boolean found = false;
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;
            if (sq == num) {
    
                return true;
            } else if (sq < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return found;
    }
}