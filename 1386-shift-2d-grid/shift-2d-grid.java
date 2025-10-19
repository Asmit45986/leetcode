import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int r = arr.length;
        int c = arr[0].length;
        LinkedList<Integer> l = new LinkedList<>();

        // Step 1: Flatten the grid into a list
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                l.add(arr[i][j]);
            }
        }

        // Step 2: Rotate the list k times
        rotateList(l, k);

        // Step 3: Convert back to 2D list
        List<List<Integer>> res = new ArrayList<>();
        Iterator<Integer> it = l.iterator();

        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                row.add(it.next());
            }
            res.add(row);
        }

        return res;
    }

    public static void rotateList(LinkedList<Integer> l, int k) {
        if (l.isEmpty() || k == 0) return;

        k = k % l.size(); // handle if k > size
        for (int i = 0; i < k; i++) {
            int last = l.removeLast();
            l.addFirst(last);
        }
    }

    // You can test it using main()
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 4;
        Solution sol = new Solution();
        System.out.println(sol.shiftGrid(arr, k));
    }
}
