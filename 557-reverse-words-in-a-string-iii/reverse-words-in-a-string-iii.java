class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String a = words[i];
            char[] ch = a.toCharArray();
            int start = 0;
            int end = a.length() - 1;
            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            words[i] = new String(ch);
        }

        String result = String.join(" ", words);
        return result;
        
    }
}