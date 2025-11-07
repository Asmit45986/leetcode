class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            int index = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (min >= arr[i][j]) {
                    min = arr[i][j];
                    index = j;

                }

            }
            boolean lucky = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][index] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                ll.add(min);
                return ll;
            }

        }
        return ll;
        
    }
}