class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        for(int i = 0 ; i<n ; i++){
            String curr = ""; 
            for(int j = i ; j<n ; j++){
                char ch = s.charAt(j);
                if(curr.indexOf(ch) != -1){
                    break;
                }
                curr += ch;
                maxlen = Math.max(maxlen,curr.length());
            }   
        }
        return maxlen;
    }
}