class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        String result = String.join(" ", words);
        return result;
    
    }    
  
}