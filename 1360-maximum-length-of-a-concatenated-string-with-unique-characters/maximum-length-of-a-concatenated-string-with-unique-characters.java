class Solution {
    int max = 0;
    public int maxLength(List<String> arr) {
        solve(0,arr,"");
        return max;
    }
    void solve(int idx,List<String>arr , String s){
        if(idx==arr.size()){
            if(!check(s)){
                max  = Math.max(max,s.length());
            }
            return;

        }
        solve(idx+1,arr,s);
        s += arr.get(idx);
        solve(idx+1,arr,s);
    }
    boolean check(String s){
        Set<Character>dup = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!dup.add(ch)){
                return true;
            }
        }
        return false;
    }
}