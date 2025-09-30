class Solution {
    public int triangularSum(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int d = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                d = (arr[j] + arr[j + 1]) % 10;
                arr[j] = d;
                res = arr[j];

            }
        }
        return res;
    }
}