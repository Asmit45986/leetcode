class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        Boolean sol[] = new Boolean[n]; 
        String p = "aeiou";
        for (int i = 0; i < n; i++) {
            char a = words[i].charAt(0);
            char b = words[i].charAt(words[i].length() - 1);
            if (p.contains(a + "") && p.contains(b + "")) {
                sol[i] = true;
            } else {
                sol[i] = false;
            }
        }
        int prefix[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (sol[i] ? 1 : 0);
        }
        int m = queries.length;
        int res[] = new int[m];

        for (int i = 0; i < m; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            res[i] = prefix[b + 1] - prefix[a];
        }

        return res;
    }
}