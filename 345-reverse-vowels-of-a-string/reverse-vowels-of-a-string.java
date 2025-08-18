class Solution {
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int start = 0;
        int end =s.length() - 1;

        while (start < end) {
            char i = str.charAt(start);
            char j = str.charAt(end);

            if (!isVowel(i)) {
                start++;
            } else if (!isVowel(j)) {
                end--;
            } else {
                char temp = i;
                str.setCharAt(start, j);
                str.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        return str.toString();
        
    }
}