
class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = grid.length;
        int n = a * a;
        int[] count = new int[n + 1];
        int[] ans = new int[2];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                count[grid[i][j]]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeated = i;
            }
        }
        ans[0] = repeated;
        ans[1] = missing;

        return ans;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(result[0]+" "+result[1]);

    }
}
