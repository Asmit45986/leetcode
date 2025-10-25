class Solution {
    public int[] searchRange(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res[0] = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res[1] = mid;
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
        
    }
}