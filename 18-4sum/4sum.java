class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ll = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i+1 && arr[j] == arr[j - 1]) continue;
                for (int k = j + 1; k < arr.length - 1; k++) {
                    if (k > j+1 && arr[k] == arr[k - 1]) continue;
                    for (int l = k + 1; l < arr.length; l++) {
                        if (l > k+1 && arr[l] == arr[l - 1]) continue;
                        long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            ll.add(temp);
                        }
                    }
                }
            }
        }
        return ll;
    }
}