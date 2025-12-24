class Solution {
    String max = "";
    public String longestPalindrome(String s) {
        int n = s.length();
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n;j++){
                String ans = s.substring(i,j+1);
                if(ispalin(ans) && max.length()<ans.length()){
                    max = ans;
                }
            }
        }
        return max;
    }
    boolean ispalin(String ans){
        int i = 0;
        int j = ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}