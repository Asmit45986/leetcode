class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res = new ArrayList<>();
        solve(0,s,new ArrayList(),res); 
        return res;
    }
    boolean ispalind(String s, int idx , int i){
        while(idx<i){
            if(s.charAt(idx)!=s.charAt(i)){
                return false;
            }
            idx++;
            i--;
            
        }
        return true;
    }
    void solve(int idx,String s,List<String>ll,List<List<String>>res){
        if(idx==s.length()){
            res.add(new ArrayList(ll));
        }


        for(int i = idx ; i<s.length();i++){
            if(ispalind(s,idx,i)){
                ll.add(s.substring(idx,i+1));
                solve(i+1,s,ll,res);
                ll.remove(ll.size()-1);
            }
        }
    }
}