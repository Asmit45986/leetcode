class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ll = new ArrayList<>();
        List<Integer>ml = new ArrayList<>();
        subset(nums,0,ll,ml);
        return ll;

    }
    public static void subset(int nums[],int i,List<List<Integer>>ll,List<Integer>ml){
        if(i==nums.length){
            ll.add(new ArrayList<>(ml));
            return;
        }
        subset(nums,i+1,ll,ml);
        ml.add(nums[i]);
        subset(nums,i+1,ll,ml);
        ml.remove(ml.size()-1);
        
    }
}