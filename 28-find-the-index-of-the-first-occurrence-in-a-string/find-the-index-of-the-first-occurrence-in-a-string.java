class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();//text
        int n = needle.length();//pattern
        boolean found = false;
        for (int i = 0; i <= m - n; i++) {
            found = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
        
    }
    
}