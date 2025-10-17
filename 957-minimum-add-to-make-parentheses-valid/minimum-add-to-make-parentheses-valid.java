class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
                count++;
            } else {

                if (!st.empty() && st.peek() == '(') {
                    count--;
                    st.pop();
                } else {
                    st.push(ch);
                    count++;
                }
            }

        }  
        return count;
    }
}