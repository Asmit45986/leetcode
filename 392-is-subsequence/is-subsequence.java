class Solution {
    public boolean isSubsequence(String s, String t) {
        char ch[] = s.toCharArray();
        char dh[] = t.toCharArray();
        int index = 0;
        for (int i = 0; i < t.length() && index < s.length(); i++) {
            if (dh[i] == ch[index]) {
                index++;
            }
        }
        if(index==s.length()){
            return true;
        }
        return false;
    }
}