class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>>ll = new ArrayList<>();
        List<Integer>ml = new ArrayList<>();
        subset(nums,0,ml,ll);  
        return ll;
    }
    public static void subset(int nums[],int i,List<Integer>ml,List<List<Integer>>ll){
        if(i==nums.length){
            ll.add(new ArrayList<>(ml));
            return;
        }
        ml.add(nums[i]);
        subset(nums,i+1,ml,ll);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        ml.remove(ml.size()-1);
        subset(nums,i+1,ml,ll);
    }
}