class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
                count++;
                max = Math.max(max, count);
            } else if (ch == ')') {
                count--;
            }
        }
        return max;

    }
}