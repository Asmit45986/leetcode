import java.util.Map;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int arr:nums){
            if(map.containsKey(arr)){
                return true;
            }
            map.put(arr,1);
        }
        return false;
    }  
}