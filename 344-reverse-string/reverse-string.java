class Solution {

    public void reverseString(char[] s) {
        int end = s.length - 1;
        int start = 0;
        while (start < end) {
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
}        