class Solution {
    public int minCost(String s, int[] arr) {
        int res = 0;
        char ch[] = s.toCharArray();
        int i = 0;
        int j = 1;
        while (j < ch.length) {
            if (ch[i] == ch[j]) {
                int a = arr[i];
                int b = arr[j];
                if (a >= b) {
                    res += b;
                    j++;
                } else if (b > a) {
                    res += a;
                    i = j;
                    j++;
                }
            } else {
                i = j;
                j++;
            }
        }
        System.out.println(res);
        return res;
    }
}