class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        boolean found = palin(s,0,s.length()-1);
        return found;   
    }
    public static boolean palin(String s, int i, int j){
        if(i>=j){
            return true;

        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return palin(s,i+1,j-1);
    }    
}