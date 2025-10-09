class Solution {
    public boolean checkIfPangram(String s) {
        char ch[] = s.toCharArray();
        Map<Character, Integer> mp = new HashMap<>();
        for (var c : ch) {
            if (!mp.containsKey(c)) {
                mp.put(c, 1);
            }
        }
        if(mp.size()==26){
            return true;
        }
        return false;
        
    }
}