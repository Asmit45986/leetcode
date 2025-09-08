class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            a += s.charAt(i)-'a';
        }
        for (int j = 0; j < t.length(); j++) {
            b += t.charAt(j)-'a';
        }
        return (char) (b-a+'a') ;
    }
}